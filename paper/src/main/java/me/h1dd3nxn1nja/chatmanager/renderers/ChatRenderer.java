package me.h1dd3nxn1nja.chatmanager.renderers;

import com.ryderbelserion.vital.api.enums.Support;
import me.clip.placeholderapi.PlaceholderAPI;
import net.kyori.adventure.audience.Audience;
import net.kyori.adventure.chat.SignedMessage;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;
import net.kyori.adventure.text.minimessage.tag.resolver.TagResolver;
import net.kyori.adventure.text.minimessage.tag.standard.StandardTags;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ChatRenderer extends AbstractRenderer {

    private final SignedMessage message;

    public ChatRenderer(SignedMessage message) {
        this.message = message;
    }

    @Override
    public @NotNull Component render(@NotNull Player source, @NotNull Component sourceDisplayName, @NotNull Component message, @NotNull Audience viewer) {
        String format = "%luckperms_prefix%{player} » {message}";

        Collection<TagResolver> resolver = new HashSet<>();
        //resolver.add(StandardTags.defaults());
        resolver.add(chat(source, message));

        MiniMessage builder = MiniMessage.builder()
                .tags(TagResolver
                        .builder()
                        .resolvers(resolver)
                        .build())
                .build();

        Map<String, String> placeholders = new HashMap<>();

        placeholders.put("{player}", source.getName());
        placeholders.put("{message}", this.message.message());

        String value = Support.placeholder_api.isEnabled() ? PlaceholderAPI.setPlaceholders(source, getMessage(placeholders, format)) : getMessage(placeholders, format);

        return builder.deserialize(value);
    }
}