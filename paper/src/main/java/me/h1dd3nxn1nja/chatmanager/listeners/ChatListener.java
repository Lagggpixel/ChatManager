package me.h1dd3nxn1nja.chatmanager.listeners;

import io.papermc.paper.event.player.AsyncChatEvent;
import me.h1dd3nxn1nja.chatmanager.ChatManager;
import me.h1dd3nxn1nja.chatmanager.renderers.ChatRenderer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class ChatListener implements Listener {

    private final @NotNull ChatManager plugin = JavaPlugin.getPlugin(ChatManager.class);

    @EventHandler(priority = EventPriority.NORMAL, ignoreCancelled = true)
    public void onChat(AsyncChatEvent event) {
        event.renderer(new ChatRenderer(event.signedMessage()));
    }
}