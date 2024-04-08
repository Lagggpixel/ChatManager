package me.h1dd3nxn1nja.chatmanager.renderers;

import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.chat.SignedMessage;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.HashMap;
import java.util.Map;

public class ChatRenderer extends AbstractRenderer {

    private final SignedMessage message;

    public ChatRenderer(SignedMessage message) {
        this.message = message;
    }

    @Override
    public @NotNull Component render(@NotNull Player source, @NotNull Component sourceDisplayName, @NotNull Component message, @NotNull Audience viewer) {
        String format = "{player} » {message}";

        MiniMessage builder = MiniMessage.builder()
                .tags(getTags(source))
                .build();

        Map<String, String> placeholders = new HashMap<>();

        placeholders.put("{player}", source.getName());
        placeholders.put("{message}", this.message.message());

        return builder.deserialize(getMessage(placeholders, format));
    }
}