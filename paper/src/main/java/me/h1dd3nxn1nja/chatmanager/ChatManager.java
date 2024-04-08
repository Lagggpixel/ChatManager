package me.h1dd3nxn1nja.chatmanager;

import me.h1dd3nxn1nja.chatmanager.listeners.ChatListener;
import me.h1dd3nxn1nja.chatmanager.renderers.ChatRenderer;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatManager extends JavaPlugin {

    private static ChatRenderer chatRenderer;

    @Override
    public void onEnable() {
        chatRenderer = new ChatRenderer();

        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    public static ChatRenderer getChatRenderer() {
        return chatRenderer;
    }
}