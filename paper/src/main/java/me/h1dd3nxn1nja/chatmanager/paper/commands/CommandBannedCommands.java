package me.h1dd3nxn1nja.chatmanager.paper.commands;

import com.ryderbelserion.chatmanager.paper.files.Files;
import me.h1dd3nxn1nja.chatmanager.paper.ChatManager;
import me.h1dd3nxn1nja.chatmanager.paper.Methods;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.List;

public class CommandBannedCommands implements CommandExecutor {

	private final ChatManager plugin = ChatManager.getPlugin();

	@Override
	public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, String[] args) {
		if (!(sender instanceof Player player)) {
			Methods.sendMessage(sender, "&cError: You can only use that command in-game", true);
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("BannedCommands")) {
			if (player.hasPermission("chatmanager.bannedcommands")) {
				if (args.length == 0) {
					Methods.sendMessage(player, "", true);
					Methods.sendMessage(player, " &3Banned Commands Help Menu &f(v" + plugin.getDescription().getVersion() + ")", true);
					Methods.sendMessage(player, "", true);
					Methods.sendMessage(player, " &6<> &f= Required Arguments", true);
					Methods.sendMessage(player, "", true);
					Methods.sendMessage(player, " &f/BannedCommands Help &e- Shows the banned commands help menu.", true);
					Methods.sendMessage(player, " &f/BannedCommands Add &6<command> &e- Add a command to the banned command list.", true);
					Methods.sendMessage(player, " &f/BannedCommands Remove &6<command> &e- Remove a command from the banned command list.", true);
					Methods.sendMessage(player, " &f/BannedCommands List &e- Shows a list of the servers banned commands.", true);
					Methods.sendMessage(player, "", true);
				}
			} else {
				Methods.sendMessage(player, Methods.noPermission(), true);
				return true;
			}

			if (args[0].equalsIgnoreCase("help")) {
				if (player.hasPermission("chatmanager.bannedcommands.help")) {
					if (args.length == 1) {
						Methods.sendMessage(player, "", true);
						Methods.sendMessage(player, " &3Banned Commands Help Menu &f(v" + plugin.getDescription().getVersion() + ")", true);
						Methods.sendMessage(player, "", true);
						Methods.sendMessage(player, " &6<> &f= Required Arguments", true);
						Methods.sendMessage(player, "", true);
						Methods.sendMessage(player, " &f/BannedCommands Help &e- Shows the banned commands help menu.", true);
						Methods.sendMessage(player, " &f/BannedCommands Add &6<command> &e- Add a command to the banned command list.", true);
						Methods.sendMessage(player, " &f/BannedCommands Remove &6<command> &e- Remove a command from the banned command list.", true);
						Methods.sendMessage(player, " &f/BannedCommands List &e- Shows a list of the servers banned commands.", true);
						Methods.sendMessage(player, "", true);
					}
				} else {
					Methods.sendMessage(player, Methods.noPermission(), true);
					return true;
				}
			}

			FileConfiguration bannedCommands = Files.BANNED_COMMANDS.getFile();
			FileConfiguration messages = Files.MESSAGES.getFile();

			if (args[0].equalsIgnoreCase("add")) {
				if (player.hasPermission("chatmanager.bannedcommands.add")) {
					if (args.length == 2) {
						if (!bannedCommands.getStringList("Banned-Commands").contains(args[1])) {
							List<String> list = bannedCommands.getStringList("Banned-Commands");
							list.add(args[1].toLowerCase());
							bannedCommands.set("Banned-Commands", list);
							Files.BANNED_COMMANDS.saveFile();
							Files.BANNED_COMMANDS.reloadFile();
							Methods.sendMessage(player, messages.getString("Banned_Commands.Command_Added").replace("{command}", args[1]), true);
						} else {
							Methods.sendMessage(player, messages.getString("Banned_Commands.Command_Exists").replace("{command}", args[1]), true);
						}
					} else {
						Methods.sendMessage(player, "&cCommand Usage: &7/Bannedcommands add <command>", true);
					}
				} else {
					Methods.sendMessage(player, Methods.noPermission(), true);
				}
			}
			if (args[0].equalsIgnoreCase("remove")) {
				if (player.hasPermission("chatmanager.bannedcommands.remove")) {
					if (args.length == 2) {
						if (bannedCommands.getStringList("Banned-Commands").contains(args[1])) {
							List<String> list = bannedCommands.getStringList("Banned-Commands");
							list.remove(args[1].toLowerCase());
							bannedCommands.set("Banned-Commands", list);
							Files.BANNED_COMMANDS.saveFile();
							Files.BANNED_COMMANDS.reloadFile();
							Methods.sendMessage(player, messages.getString("Banned_Commands.Command_Removed").replace("{command}", args[1]), true);
						} else {
							Methods.sendMessage(player, messages.getString("Banned_Commands.Command_Not_Found").replace("{command}", args[1]), true);
						}
					} else {
						Methods.sendMessage(player, "&cCommand Usage: &7/Bannedcommands remove <command>", true);
					}
				} else {
					Methods.sendMessage(player, Methods.noPermission(), true);
				}
			}
			if (args[0].equalsIgnoreCase("list")) {
				if (player.hasPermission("chatmanager.bannedcommands.list")) {
					if (args.length == 1) {
						String list = bannedCommands.getStringList("Banned-Commands").toString().replace("[", "").replace("]", "");
						Methods.sendMessage(player, "", true);
						Methods.sendMessage(player, "&cCommands: &7" + list, true);
						player.sendMessage(" ");
					} else {
						Methods.sendMessage(player, "&cCommand Usage: &7/Bannedcommands list", true);
					}
				} else {
					Methods.sendMessage(player, Methods.noPermission(), true);
				}
			}
		}

		return true;
	}
}