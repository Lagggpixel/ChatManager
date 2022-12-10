package me.h1dd3nxn1nja.chatmanager.utils;

import me.h1dd3nxn1nja.chatmanager.ChatManager;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;

public class Debug {
	
	public static void debugAutoBroadcast() {
		
		FileConfiguration autobroadcast = ChatManager.settings.getAutoBroadcast();
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Auto-Broadcast Debug in progress...");
		
		//Global Messages
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Enable in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Header_And_Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Header_And_Footer in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Interval")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Interval in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Prefix in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Header")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Header in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Footer in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Sound in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Global_Messages.Messages")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Global_Messages.Messages in the autobroadcast.yml file.");
		}
		
		//Per world messages
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Enable in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Header_And_Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Header_And_Footer in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Interval")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Interval in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Prefix in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Header")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Header in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Footer in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Per_World_Messages.Sound in the autobroadcast.yml file.");
		}
		
		for (final String key : autobroadcast.getConfigurationSection("Auto_Broadcast.Per_World_Messages.Messages").getKeys(false)) {
            if (!autobroadcast.contains("Auto_Broadcast.Per_World_Messages.Messages." + key)) {
                Bukkit.getConsoleSender().sendMessage("[ChatManager] The section Auto_Broadcast.Per_World_Messages.Messages." + key + " is either missing or isn't formatted correctly.");
            }
        }
		
		//Actionbar messages
		
		if (!autobroadcast.contains("Auto_Broadcast.Actionbar_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Actionbar_Messages.Enable in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Actionbar_Messages.Interval")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Actionbar_Messages.Interval in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Actionbar_Messages.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Actionbar_Messages.Prefix in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Actionbar_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Actionbar_Messages.Sound in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Actionbar_Messages.Messages")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Actionbar_Messages.Messages in the autobroadcast.yml file.");
		}
		
		//Title messages
		
		if (!autobroadcast.contains("Auto_Broadcast.Title_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Title_Messages.Enable in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Title_Messages.Interval")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Title_Messages.Interval in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Title_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Title_Messages.Sound in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Title_Messages.Title")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Title_Messages.Title in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Title_Messages.Messages")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Title_Messages.Messages in the autobroadcast.yml file.");
		}
		
		//Boss bar messages
		
		if (!autobroadcast.contains("Auto_Broadcast.Bossbar_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Bossbar_Messages.Enable in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Bossbar_Messages.Interval")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Bossbar_Messages.Interval in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Bossbar_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Bossbar_Messages.Sound in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Bossbar_Messages.Bar_Time")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Bossbar_Messages.Bar_Time in the autobroadcast.yml file.");
		}
		
		if (!autobroadcast.contains("Auto_Broadcast.Bossbar_Messages.Messages")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Bossbar_Messages.Messages in the autobroadcast.yml file.");
		}
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Debug Complete!");
		Bukkit.getConsoleSender().sendMessage("[ChatManager] If any of the sections are missing in the autobroadcast.yml file please contact the developer.");
		
	}
	
	public static void debugConfig() {
		
		FileConfiguration config = ChatManager.settings.getConfig();
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Config Debug in progress...");
		
		//Anti Advertising Chat
		
		if (!config.contains("Anti_Advertising.Chat.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Chat.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Chat.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Notify_Staff in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Chat.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Execute_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Chat.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Executed_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Chat.Log_Advertisers")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Log_Advertisers in the config.yml file.");
		}
		
		//Anti Advertising Commands
		
		if (!config.contains("Anti_Advertising.Commands.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Commands.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Commands.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Notify_Staff in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Commands.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Execute_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Commands.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Executed_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Commands.Log_Advertisers")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Log_Advertisers in the config.yml file.");
		}
		
		//Anti Advertising Signs
		
		if (!config.contains("Anti_Advertising.Signs.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Signs.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Signs.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Notify_Staff in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Signs.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Execute_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Signs.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Executed_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Advertising.Signs.Log_Advertisers")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Log_Advertisers in the config.yml file.");
		}
		
		//Anti Advertising
		
		if (!config.contains("Anti_Advertising.Whitelist")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Whitelist in the config.yml file.");
		}
		
		//Anti Bot
		
		if (!config.contains("Anti_Bot.Block_Chat_Until_Moved")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Bot.Block_Chat_Until_Moved in the config.yml file.");
		}
		
		if (!config.contains("Anti_Bot.Block_Commands_Until_Moved")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Bot.Block_Commands_Until_Moved in the config.yml file.");
		}
		
		//Anti Caps
		
		if (!config.contains("Anti_Caps.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Caps.Enable_In_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Enable_In_Commands in the config.yml file.");
		}
		
		if (!config.contains("Anti_Caps.Min_Message_Length")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Min_Message_Length in the config.yml file.");
		}
		
		if (!config.contains("Anti_Caps.Required_Percentage")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Required_Percentage in the config.yml file.");
		}
		
		//Anti Spam Chat
		
		if (!config.contains("Anti_Spam.Chat.Chat_Delay")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Chat.Chat_Delay in the config.yml file.");
		}
		
		if (!config.contains("Anti_Spam.Chat.Block_Repetitive_Messages")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Chat.Block_Repetitive_Messages in the config.yml file.");
		}
		
		//Anti Spam Commands
		
		if (!config.contains("Anti_Spam.Command.Command_Delay")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Command.Command_Delay in the config.yml file.");
		}
		
		if (!config.contains("Anti_Spam.Command.Block_Repetitive_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Command.Block_Repetitive_Commands in the config.yml file.");
		}
		
		if (!config.contains("Anti_Spam.Command.Whitelist")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Command.Whitelist in the config.yml file.");
		}
		
		//Anti Swear Chat
		
		if (!config.contains("Anti_Swear.Chat.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Chat.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Chat.Block_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Block_Message in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Chat.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Notify_Staff in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Chat.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Execute_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Chat.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Executed_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Chat.Log_Swearing")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Log_Swearing in the config.yml file.");
		}
		
		//Anti Swear Commands
		
		if (!config.contains("Anti_Swear.Commands.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Commands.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Commands.Block_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Block_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Commands.Whitelisted_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Whitelisted_Commands in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Commands.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Notify_Staff in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Commands.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Execute_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Commands.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Executed_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Commands.Log_Swearing")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Log_Swearing in the config.yml file.");
		}
		
		//Anti Swear Signs
		
		if (!config.contains("Anti_Swear.Signs.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Signs.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Anti_Swear.Signs.Block_Sign")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Block_Sign in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Signs.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Notify_Staff in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Signs.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Execute_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Signs.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Executed_Command in the config.yml file.");
		}
				
		if (!config.contains("Anti_Swear.Signs.Log_Swearing")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Log_Swearing in the config.yml file.");
		}
		
		//Anti Unicode
		
		if (!config.contains("Anti_Unicode.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Enable in the config.yml file.");
		}
		
		if (!config.contains("Anti_Unicode.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Notify_Staff in the config.yml file.");
		}
		
		if (!config.contains("Anti_Unicode.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Execute_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Unicode.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Executed_Command in the config.yml file.");
		}
		
		if (!config.contains("Anti_Unicode.Whitelist")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Whitelist in the config.yml file.");
		}
		
		//Banned Commands
		
		if (!config.contains("Banned_Commands.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Enable in the config.yml file.");
		}
		
		if (!config.contains("Banned_Commands.Increase_Sensitivity")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Increase_Sensitivity in the config.yml file.");
		}
		
		if (!config.contains("Banned_Commands.Notify_Staff")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Notify_Staff in the config.yml file.");
		}
		
		if (!config.contains("Banned_Commands.Execute_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Execute_Command in the config.yml file.");
		}
		
		if (!config.contains("Banned_Commands.Executed_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Executed_Command in the config.yml file.");
		}
		
		//Broadcast Commands
		
		if (!config.contains("Broadcast_Commands.Command.Broadcast.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Broadcast.Prefix in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Broadcast.Default_Color")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Broadcast.Default_Color in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Broadcast.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Broadcast.Sound in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Announcement.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Announcement.Sound in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Announcement.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Announcement.Message in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Warning.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Warning.Sound in the config.yml file.");
		}
		
		if (!config.contains("Broadcast_Commands.Command.Warning.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Broadcast_Commands.Command.Warning.Message in the config.yml file.");
		}
		
		//Chat Format
		
		if (!config.contains("Chat_Format.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Format.Enable in the config.yml file.");
		}
		
		if (!config.contains("Chat_Format.Default_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Format.Default_Format in the config.yml file.");
		}
		
		for (String key : config.getConfigurationSection("Chat_Format.Groups").getKeys(false)) {
			if (!config.contains("Chat_Format.Groups." + key + ".Format")) {
				Bukkit.getConsoleSender().sendMessage("[ChatManager] The section Chat_Format.Groups." + key + ".Format is either missing or isn't formatted correctly.");
			}
		}
		
		//Chat Radius
		
		if (!config.contains("Chat_Radius.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Enable in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Default_Channel")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Default_Channel in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Local_Chat")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Local_Chat in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Local_Chat.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Local_Chat.Prefix in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Local_Chat.Override_Symbol")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Local_Chat.Override_Symbol in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Global_Chat")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Global_Chat in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Global_Chat.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Global_Chat.Prefix in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Global_Chat.Override_Symbol")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Global_Chat.Override_Symbol in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.World_Chat")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.World_Chat in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.World_Chat.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.World_Chat.Prefix in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.World_Chat.Override_Symbol")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.World_Chat.Override_Symbol in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Block_Distance")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Block_Distance in the config.yml file.");
		}
		
		if (!config.contains("Chat_Radius.Enable_Spy_On_Join")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Enable_Spy_On_Join in the config.yml file.");
		}
		
		//Clear Chat
		
		if (!config.contains("Clear_Chat.Clear_On_Join")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Clear_Chat.Clear_On_Join in the config.yml file.");
		}
		
		if (!config.contains("Clear_Chat.Broadcasted_Lines")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Clear_Chat.Broadcasted_Lines in the config.yml file.");
		}
		
		//Command Spy
		
		if (!config.contains("Command_Spy.Enable_On_Join")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Command_Spy.Enable_On_Join in the config.yml file.");
		}
		
		if (!config.contains("Command_Spy.Blacklist_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Command_Spy.Blacklist_Commands in the config.yml file.");
		}
		
		//Formatted Messages
		
		if (!config.contains("Formatted_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Formatted_Messages.Enable in the config.yml file.");
		}
		
		//Grammar
		
		if (!config.contains("Grammar.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Grammar.Enable in the config.yml file.");
		}
		
		if (!config.contains("Grammar.Min_Message_Length")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Grammar.Min_Message_Length in the config.yml file.");
		}
		
		if (!config.contains("Grammar.Autocorrect.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Grammar.Autocorrect.Enable in the config.yml file.");
		}
		
		//Lists
		
		if (!config.contains("Lists.Staff_List")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Lists.Staff_List in the config.yml file.");
		}
		
		if (!config.contains("Lists.Player_List")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Lists.Player_List in the config.yml file.");
		}
		
		//Logs
		
		if (!config.contains("Logs.Log_Chat")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Logs.Log_Chat in the config.yml file.");
		}
		
		if (!config.contains("Logs.Log_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Logs.Log_Commands in the config.yml file.");
		}
		
		if (!config.contains("Logs.Log_Signs")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Logs.Log_Signs in the config.yml file.");
		}
		
		if (!config.contains("Logs.Blacklist_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Logs.Blacklist_Commands in the config.yml file.");
		}
		
		//First Join Messages
		
		if (!config.contains("Messages.First_Join.Welcome_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Welcome_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Welcome_Message.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Welcome_Message.Sound in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Welcome_Message.First_Join_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Welcome_Message.First_Join_Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Actionbar_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Actionbar_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Welcome_Message.First_Join_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Welcome_Message.First_Join_Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.Fade_In")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.Fade_In in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.Stay")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.Stay in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.Fade_Out")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.Fade_Out in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.First_Join_Message.Header")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.First_Join_Message.Header in the config.yml file.");
		}
		
		if (!config.contains("Messages.First_Join.Title_Message.First_Join_Message.Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.First_Join.Title_Message.First_Join_Message.Footer in the config.yml file.");
		}
		
		//Join & Quit Messages
		
		if (!config.contains("Messages.Join_Quit_Messages.Join_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Join_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Join_Message.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Join_Message.Sound in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Join_Message.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Join_Message.Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Quit_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Quit_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Quit_Message.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Quit_Message.Sound in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Quit_Message.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Quit_Message.Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Actionbar_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Actionbar_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Actionbar_Message.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Actionbar_Message.Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Enable in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Fade_In")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Fade_In in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Stay")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Stay in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Fade_Out")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Fade_Out in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Message in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Message.Header")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Message.Header in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Title_Message.Message.Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Title_Message.Message.Footer in the config.yml file.");
		}
		
		if (!config.contains("Messages.Join_Quit_Messages.Group_Messages.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Group_Messages.Enable in the config.yml file.");
		}
		
		for (String key : config.getConfigurationSection("Messages.Join_Quit_Messages.Group_Messages").getKeys(false)) {
			if (!config.contains("Messages.Join_Quit_Messages.Group_Messages." + key)) {
				Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Messages.Join_Quit_Messages.Group_Messages." + key + "in the config.yml file.");
			}
		}
		
		//Mentions
		
		if (!config.contains("Mentions.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Enable in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Sound in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Tag_Symbol")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Tag_Symbol in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Mention_Color")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Mention_Color in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Title.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Title.Enable in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Title.Header")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Title.Header in the config.yml file.");
		}
		
		if (!config.contains("Mentions.Title.Footer")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mentions.Title.Footer in the config.yml file.");
		}
		
		//MOTD
		
		if (!config.contains("MOTD.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section MOTD.Enable in the config.yml file.");
		}
		
		if (!config.contains("MOTD.Delay")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section MOTD.Delay in the config.yml file.");
		}
		
		if (!config.contains("MOTD.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section MOTD.Message in the config.yml file.");
		}
		
		//Mute Chat
		
		if (!config.contains("Mute_Chat.Disable_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Disable_Commands in the config.yml file.");
		}
		
		if (!config.contains("Mute_Chat.Disabled_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Disabled_Commands in the config.yml file.");
		}
		
		//Per world chat
		
		if (!config.contains("Per_World_Chat.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Enable in the config.yml file.");
		}
		
		if (!config.contains("Per_World_Chat.Group_Worlds")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Group_Worlds in the config.yml file.");
		}
		
		if (!config.contains("Per_World_Chat.Group_Worlds.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Group_Worlds.Enable in the config.yml file.");
		}
		
		if (!config.contains("Per_World_Chat.Group_Worlds.Worlds")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Group_Worlds.Worlds in the config.yml file.");
		}
		
		for (String key : config.getConfigurationSection("Per_World_Chat.Group_Worlds.Worlds").getKeys(false)) {
			if (!config.contains("Per_World_Chat.Group_Worlds.Worlds." + key)) {
				Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Group_Worlds.Worlds." + key + "in the config.yml file.");
			}
		}
		
		//Private Message
		
		if (!config.contains("Private_Messages.Sender.Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Sender.Format in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Sender.Tooltip")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Sender.Tooltip in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Sender.Click_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Sender.Click_Command in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Receiver.Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Receiver.Format in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Receiver.Tooltip")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Receiver.Tooltip in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Receiver.Click_Command")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Receiver.Click_Command in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Sound")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Sound in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Enable_JSON")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Enable_JSON in the config.yml file.");
		}
		
		if (!config.contains("Private_Messages.Enable_JSON")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Messages.Enable_JSON in the config.yml file.");
		}
		
		//Server Name
		
		if (!config.contains("Server_Name")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Server_Name in the config.yml file.");
		}
		
		//Server Rules
		
		if (!config.contains("Server_Rules.Rules")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Server_Rules.Rules in the config.yml file.");
		}
		
		for (String key : config.getConfigurationSection("Server_Rules.Rules").getKeys(false)) {
			if (!config.contains("Server_Rules.Rules." + key)) {
				Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Server_Rules.Rules." + key + "in the config.yml file.");
			}
		}
		
		//Social Spy
		
		if (!config.contains("Social_Spy.Enable_On_Join")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Social_Spy.Enable_On_Join in the config.yml file.");
		}
		
		//Staff Chat
		
		if (!config.contains("Staff_Chat.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Enable in the config.yml file.");
		}
		
		if (!config.contains("Staff_Chat.Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Format in the config.yml file.");
		}
		
		if (!config.contains("Staff_Chat.Boss_Bar.Enable")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Boss_Bar.Enable in the config.yml file.");
		}
		
		if (!config.contains("Staff_Chat.Boss_Bar.Title")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Boss_Bar.Title in the config.yml file.");
		}
		
		//Update Checker
		
		if (!config.contains("Update_Checker")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Update_Checker in the config.yml file.");
		}
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Debug Complete!");
		Bukkit.getConsoleSender().sendMessage("[ChatManager] If any of the sections are missing in the config.yml file please contact the developer.");
		
	}
	
	public static void debugMessages() {
		
		FileConfiguration messages = ChatManager.settings.getMessages();
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Messages Debug in progress...");
		
		if (!messages.contains("Message.Prefix")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Message.Prefix in the messages.yml file.");
		}
		
		if (!messages.contains("Message.No_Permission")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Message.No_Permission in the messages.yml file.");
		}
		
		if (!messages.contains("Message.Player_Not_Found")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Message.Player_Not_Found in the messages.yml file.");
		}
		
		if (!messages.contains("Message.Reload")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Message.Reload in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Chat.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Chat.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Chat.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Commands.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Commands.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Commands.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Signs.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Advertising.Signs.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Advertising.Signs.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Bot.Deny_Chat_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Bot.Deny_Chat_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Bot.Deny_Command_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Bot.Deny_Command_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Caps.Message_Chat")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Message_Chat in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Caps.Message_Commands")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Caps.Message_Commands in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Spam.Chat.Repetitive_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Chat.Repetitive_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Spam.Chat.Delay_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Chat.Delay_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Spam.Command.Repetitive_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Command.Repetitive_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Spam.Command.Delay_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Spam.Command.Delay_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Chat.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Chat.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Chat.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Commands.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Commands.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Commands.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Signs.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Signs.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Signs.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Blacklisted_Word.Added")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Blacklisted_Word.Added in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Blacklisted_Word.Exists")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Blacklisted_Word.Exists in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Blacklisted_Word.Removed")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Blacklisted_Word.Removed in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Blacklisted_Word.Not_Found")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Blacklisted_Word.Not_Found in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Whitelisted_Word.Added")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Whitelisted_Word.Added in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Whitelisted_Word.Exists")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Whitelisted_Word.Exists in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Whitelisted_Word.Removed")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Whitelisted_Word.Removed in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Swear.Whitelisted_Word.Not_Found")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Swear.Whitelisted_Word.Not_Found in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Unicode.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Anti_Unicode.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Anti_Unicode.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Auto_Broadcast.List")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.List in the messages.yml file.");
		}
		
		if (!messages.contains("Auto_Broadcast.Added")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Added in the messages.yml file.");
		}
		
		if (!messages.contains("Auto_Broadcast.Created")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Auto_Broadcast.Created in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Command_Added")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Command_Added in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Command_Exists")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Command_Exists in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Command_Removed")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Command_Removed in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Command_Not_Found")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Command_Not_Found in the messages.yml file.");
		}
		
		if (!messages.contains("Banned_Commands.Notify_Staff_Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Banned_Commands.Notify_Staff_Format in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Local_Chat.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Local_Chat.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Local_Chat.Already_Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Local_Chat.Already_Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Global_Chat.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Global_Chat.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Global_Chat.Already_Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Global_Chat.Already_Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.World_Chat.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.World_Chat.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.World_Chat.Already_Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.World_Chat.Already_Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Spy.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Spy.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Chat_Radius.Spy.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Chat_Radius.Spy.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Clear_Chat.Staff_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Clear_Chat.Staff_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Clear_Chat.Broadcast_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Clear_Chat.Broadcast_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Command_Spy.Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Command_Spy.Format in the messages.yml file.");
		}
		
		if (!messages.contains("Command_Spy.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Command_Spy.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Command_Spy.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Command_Spy.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Mute_Chat.Denied_Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Denied_Message in the messages.yml file.");
		}
		
		if (!messages.contains("Mute_Chat.Broadcast_Messages.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Broadcast_Messages.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Mute_Chat.Broadcast_Messages.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Broadcast_Messages.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Mute_Chat.Blocked_Commands.Message")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Mute_Chat.Blocked_Commands.Message in the messages.yml file.");
		}
		
		if (!messages.contains("Per_World_Chat.Bypass_Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Bypass_Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Per_World_Chat.Bypass_Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Per_World_Chat.Bypass_Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Ping.Players_Ping")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Ping.Players_Ping in the messages.yml file.");
		}
		
		if (!messages.contains("Ping.Targets_Ping")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Ping.Targets_Ping in the messages.yml file.");
		}
		
		if (!messages.contains("Private_Message.Recipient_Not_Found")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Message.Recipient_Not_Found in the messages.yml file.");
		}
		
		if (!messages.contains("Private_Message.Toggled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Message.Toggled in the messages.yml file.");
		}
		
		if (!messages.contains("Private_Message.Ignored")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Message.Ignored in the messages.yml file.");
		}
		
		if (!messages.contains("Private_Message.Self")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Message.Self in the messages.yml file.");
		}
		
		if (!messages.contains("Private_Message.AFK")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Private_Message.AFK in the messages.yml file.");
		}
		
		if (!messages.contains("Social_Spy.Format")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Social_Spy.Format in the messages.yml file.");
		}
		
		if (!messages.contains("Social_Spy.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Social_Spy.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Social_Spy.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Social_Spy.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Staff_Chat.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Staff_Chat.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Staff_Chat.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Toggle_Chat.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Toggle_Chat.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Toggle_Chat.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Toggle_Chat.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("Toggle_Mentions.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Toggle_Mentions.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("Toggle_Mentions.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section Toggle_Mentions.Disabled in the messages.yml file.");
		}
		
		if (!messages.contains("TogglePM.Enabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section TogglePM.Enabled in the messages.yml file.");
		}
		
		if (!messages.contains("TogglePM.Disabled")) {
			Bukkit.getConsoleSender().sendMessage("[ChatManager] Missing the section TogglePM.Disabled in the messages.yml file.");
		}
		
		Bukkit.getConsoleSender().sendMessage("[ChatManager] Debug Complete!");
		Bukkit.getConsoleSender().sendMessage("[ChatManager] If any of the sections are missing in the messages.yml file please contact the developer.");
		
	}
}