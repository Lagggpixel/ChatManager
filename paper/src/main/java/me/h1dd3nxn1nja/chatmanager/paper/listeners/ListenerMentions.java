package me.h1dd3nxn1nja.chatmanager.paper.listeners;

import com.ryderbelserion.chatmanager.paper.files.Files;
import me.h1dd3nxn1nja.chatmanager.paper.ChatManager;
import me.h1dd3nxn1nja.chatmanager.paper.managers.PlaceholderManager;
import me.h1dd3nxn1nja.chatmanager.paper.support.EssentialsSupport;
import me.h1dd3nxn1nja.chatmanager.paper.support.PluginSupport;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import me.h1dd3nxn1nja.chatmanager.paper.Methods;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class ListenerMentions implements Listener {

	@NotNull
	private final ChatManager plugin = JavaPlugin.getPlugin(ChatManager.class);

	@NotNull
	private final Methods methods = this.plugin.getMethods();

	@NotNull
	private final EssentialsSupport essentialsSupport = this.plugin.getPluginManager().getEssentialsSupport();

	@NotNull
	private final PlaceholderManager placeholderManager = this.plugin.getCrazyManager().getPlaceholderManager();

	@EventHandler(ignoreCancelled = true)
	public void onChat(AsyncPlayerChatEvent event) {
		Player player = event.getPlayer();

		FileConfiguration config = Files.CONFIG.getFile();

		String tagSymbol = config.getString("Mentions.Tag_Symbol");
		String mentionColor = config.getString("Mentions.Mention_Color");

		if (!config.getBoolean("Mentions.Enable")) return;

		event.setMessage(this.plugin.getMethods().color(event.getMessage()));

		this.plugin.getServer().getOnlinePlayers().forEach(target -> {
			if (!player.hasPermission("chatmanager.mention") || !target.hasPermission("chatmanager.mention.receive")) return;

			if (!event.getMessage().contains(tagSymbol + target.getName())) return;

			if (this.plugin.api().getToggleMentionsData().containsUser(target.getUniqueId())) return;

			if (PluginSupport.ESSENTIALS.isPluginEnabled()) {
				if (essentialsSupport.isIgnored(target.getUniqueId(), player.getUniqueId()) || essentialsSupport.isMuted(player.getUniqueId())) return;
			}

			if (this.plugin.api().getToggleChatData().containsUser(target.getUniqueId())) return;

			if (config.getBoolean("Chat_Radius.Enable")) {
				if ((!this.plugin.getMethods().inRange(target.getUniqueId(), player.getUniqueId(), config.getInt("Chat_Radius.Block_Distance"))) || (!this.plugin.getMethods().inWorld(target.getUniqueId(), player.getUniqueId()))) return;
			}

			if (!this.plugin.api().getToggleMentionsData().containsUser(target.getUniqueId())) {
				String path = "Mentions.sound";
				this.methods.playSound(target, config, path);
			}

			if (config.getBoolean("Mentions.Title.Enable")) {
				String header = this.placeholderManager.setPlaceholders(player, config.getString("Mentions.Title.Header"));
				String footer = this.placeholderManager.setPlaceholders(player, config.getString("Mentions.Title.Footer"));

				target.sendTitle(header, footer, 40, 20, 40);
			}

			if (!config.getString("Mentions.Mention_Color").equals("")) {
				String before = event.getMessage();
				String lastColor = ChatColor.getLastColors(before).equals("") ? ChatColor.WHITE.toString() : ChatColor.getLastColors(before);
				event.setMessage(event.getMessage().replace(tagSymbol + ChatColor.stripColor(target.getName()), this.plugin.getMethods().color(mentionColor + tagSymbol + ChatColor.stripColor(target.getName())) + lastColor));
			}
		});

		if (event.getMessage().toLowerCase().contains(tagSymbol + "everyone")) {
			this.plugin.getServer().getOnlinePlayers().forEach(target -> {
				if (player.hasPermission("chatmanager.mention.everyone") && target.hasPermission("chatmanager.mentions.receive")) {
					if (!this.plugin.api().getToggleMentionsData().containsUser(target.getUniqueId())) {
						String path = "Mentions.sound";
						methods.playSound(target, config, path);
					}

					if (config.getBoolean("Mentions.Title.Enable")) {
						String header = this.placeholderManager.setPlaceholders(player, config.getString("Mentions.Title.Header"));
						String footer = this.placeholderManager.setPlaceholders(player, config.getString("Mentions.Title.Footer"));

						target.sendTitle(header, footer, 40, 20, 40);
					}

					if (!config.getString("Mentions.Mention_Color").equals("")) {
						String before = event.getMessage();
						String lastColor = ChatColor.getLastColors(before).equals("") ? ChatColor.WHITE.toString() : ChatColor.getLastColors(before);
						event.setMessage(event.getMessage().replace(tagSymbol + ChatColor.stripColor("everyone"), this.plugin.getMethods().color(mentionColor + tagSymbol + ChatColor.stripColor("everyone")) + lastColor));
					}
				}
			});
		}
	}
}