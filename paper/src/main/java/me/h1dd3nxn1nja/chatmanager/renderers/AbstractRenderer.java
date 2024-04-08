package me.h1dd3nxn1nja.chatmanager.renderers;

import io.papermc.paper.chat.ChatRenderer;
import me.h1dd3nxn1nja.chatmanager.ChatManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public abstract class AbstractRenderer implements ChatRenderer {

    protected final @NotNull ChatManager plugin = JavaPlugin.getPlugin(ChatManager.class);

}