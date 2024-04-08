package me.h1dd3nxn1nja.chatmanager.renderers;

import io.papermc.paper.chat.ChatRenderer;
import me.h1dd3nxn1nja.chatmanager.ChatManager;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextDecoration;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.Tag;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import net.kyori.adventure.text.serializer.plain.PlainTextComponentSerializer;
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

    protected final @NotNull TagResolver chat(Player player, Component component) {
        Collection<TagResolver> resolver = new HashSet<>();

        if (player.hasPermission("chatmanager.color")) {
            resolver.add(StandardTags.color());
        }

        if (player.hasPermission("chatmanager.gradient")) {
            resolver.add(StandardTags.gradient());
        }

        if (player.hasPermission("chatmanager.rainbow")) {
            resolver.add(StandardTags.rainbow());
        }

        if (player.hasPermission("chatmanager.font")) {
            resolver.add(StandardTags.font());
        }

        if (player.hasPermission("chatmanager.decoration.*")) {
            resolver.add(StandardTags.decorations());
        } else {
            if (player.hasPermission("chatmanager.decoration.bold")) {
                resolver.add(StandardTags.decorations(TextDecoration.BOLD));
            }

            if (player.hasPermission("chatmanager.decoration.italic")) {
                resolver.add(StandardTags.decorations(TextDecoration.ITALIC));
            }

            if (player.hasPermission("chatmanager.decoration.underlined")) {
                resolver.add(StandardTags.decorations(TextDecoration.UNDERLINED));
            }

            if (player.hasPermission("chatmanager.decoration.strikethrough")) {
                resolver.add(StandardTags.decorations(TextDecoration.STRIKETHROUGH));
            }

            if (player.hasPermission("chatmanager.decoration.obfuscated")) {
                resolver.add(StandardTags.decorations(TextDecoration.OBFUSCATED));
            }
        }

        MiniMessage builder = MiniMessage.builder()
                .tags(TagResolver.builder().resolvers(resolver).build())
                .build();

        Component value = builder.deserialize(PlainTextComponentSerializer.plainText().serialize(component));

        return TagResolver.resolver("message", (argumentQueue, context) -> Tag.selfClosingInserting(value));
    }
}