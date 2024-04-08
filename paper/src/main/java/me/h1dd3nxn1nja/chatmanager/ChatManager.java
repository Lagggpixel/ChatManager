package me.h1dd3nxn1nja.chatmanager;

import com.ryderbelserion.vital.VitalPlugin;
import me.h1dd3nxn1nja.chatmanager.listeners.ChatListener;
import org.bukkit.plugin.java.JavaPlugin;

public class ChatManager extends JavaPlugin {

    @Override
    public void onEnable() {
        new VitalPlugin(this).start();

        getServer().getPluginManager().registerEvents(new ChatListener(), this);
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }
}