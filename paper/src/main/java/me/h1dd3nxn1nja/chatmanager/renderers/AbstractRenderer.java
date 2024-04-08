package me.h1dd3nxn1nja.chatmanager.renderers;

import io.papermc.paper.chat.ChatRenderer;
import me.h1dd3nxn1nja.chatmanager.ChatManager;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

public abstract class AbstractRenderer implements ChatRenderer {

    protected final @NotNull ChatManager plugin = JavaPlugin.getPlugin(ChatManager.class);

    protected String getMessage(Map<String, String> placeholders, String message) {
        for (Map.Entry<String, String> entry : placeholders.entrySet()) {
            message = message.replace(entry.getKey(), entry.getValue()).replace(entry.getKey().toLowerCase(), entry.getValue());
        }

        return message;
    }

    protected final @NotNull TagResolver getTags(Player player) {
        Collection<TagResolver> tags = new HashSet<>();

        if (player.hasPermission("chatmanager.color")) {
            tags.add(StandardTags.color());
        }

        if (player.hasPermission("chatmanager.gradient")) {
            tags.add(StandardTags.gradient());
        }

        if (player.hasPermission("chatmanager.rainbow")) {
            tags.add(StandardTags.rainbow());
        }

        if (player.hasPermission("chatmanager.font")) {
            tags.add(StandardTags.font());
        }

        if (player.hasPermission("chatmanager.decoration.*")) {
            tags.add(StandardTags.decorations());
        } else {
            if (player.hasPermission("chatmanager.decoration.bold")) {
                tags.add(StandardTags.decorations(TextDecoration.BOLD));
            }

            if (player.hasPermission("chatmanager.decoration.italic")) {
                tags.add(StandardTags.decorations(TextDecoration.ITALIC));
            }

            if (player.hasPermission("chatmanager.decoration.underlined")) {
                tags.add(StandardTags.decorations(TextDecoration.UNDERLINED));
            }

            if (player.hasPermission("chatmanager.decoration.strikethrough")) {
                tags.add(StandardTags.decorations(TextDecoration.STRIKETHROUGH));
            }

            if (player.hasPermission("chatmanager.decoration.obfuscated")) {
                tags.add(StandardTags.decorations(TextDecoration.OBFUSCATED));
            }
        }

        return TagResolver.builder().resolvers(tags).build();
    }
}