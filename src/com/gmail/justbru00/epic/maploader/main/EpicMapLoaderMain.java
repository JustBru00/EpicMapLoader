package com.gmail.justbru00.epic.maploader.main;

import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import com.gmail.justbru00.epic.maploader.commands.DownloadMapCommand;
import com.gmail.justbru00.epic.maploader.commands.ListMapsCommand;
import com.gmail.justbru00.epic.maploader.commands.LoadMapCommand;
import com.gmail.justbru00.epic.maploader.commands.SaveMapCommand;
import com.gmail.justbru00.epic.maploader.fileutil.FileManager;
import com.gmail.justbru00.epic.maploader.util.Messager;
import com.gmail.justbru00.epic.maploader.webutil.WebManager;

public class EpicMapLoaderMain extends JavaPlugin {

	private static EpicMapLoaderMain instance;
	private static String version = "NOT_SET_YET";
	private static String prefix = Messager.color("&8[&bEpic&fMapLoader&8] &f");
	private static ConsoleCommandSender console = Bukkit.getConsoleSender();
	private static Logger logger = Bukkit.getLogger();	
	
	@Override
	public void onDisable() {
		Messager.msgConsole("Disabled EpicMapLoader...");
		instance = null;
	}

	@Override
	public void onEnable() {
		instance = this;
		version = getDescription().getVersion();
		
		// REGISTER COMMANDS
		getCommand("downloadmap").setExecutor(new DownloadMapCommand());
		getCommand("listmaps").setExecutor(new ListMapsCommand());
		getCommand("loadmap").setExecutor(new LoadMapCommand());
		getCommand("savemap").setExecutor(new SaveMapCommand());
		
		// REGISTER LISTENERS?
		PluginManager pm = Bukkit.getPluginManager();
		
		// INIT MANAGERS
		WebManager.init();
		
	}

	public static EpicMapLoaderMain getInstance() {
		return instance;
	}
	
	public static String getVersion() {
		return version;
	}
	
	public static String getPrefix() {
		return prefix;
	}
	
	public static ConsoleCommandSender getConsole() {
		return console;
	}
	
	public static Logger getBukkitLogger() {
		return logger;
	}
	
}
