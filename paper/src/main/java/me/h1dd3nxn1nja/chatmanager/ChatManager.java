package me.h1dd3nxn1nja.chatmanager;

import me.h1dd3nxn1nja.chatmanager.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatManager extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}