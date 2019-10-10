/**
 * @author Justin "JustBru00" Brubaker
 * 
 * This is licensed under the MPL Version 2.0. See license info in LICENSE.txt
 */ 
package com.gmail.justbru00.epic.maploader.util;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.gmail.justbru00.epic.maploader.main.EpicMapLoaderMain;

/**
 * 
 * @author Justin Brubaker
 *
 */
public class Messager {	


	public static String color(String uncolored){
		return ChatColor.translateAlternateColorCodes('&', uncolored);		
	}
	
	public static void msgConsole(String msg) {			
		if (EpicMapLoaderMain.getConsole() != null) {
		EpicMapLoaderMain.getConsole().sendMessage(EpicMapLoaderMain.getPrefix() + Messager.color(msg));		
		} else {
			EpicMapLoaderMain.getBukkitLogger().info(ChatColor.stripColor(Messager.color(msg)));
		}
	}
	
	public static void msgPlayer(String msg, Player player) {		
		player.sendMessage(EpicMapLoaderMain.getPrefix() + Messager.color(msg));
	}	

	
	public static void msgSender(String msg, CommandSender sender) {
				sender.sendMessage(EpicMapLoaderMain.getPrefix() + Messager.color(msg));
	}	
}
