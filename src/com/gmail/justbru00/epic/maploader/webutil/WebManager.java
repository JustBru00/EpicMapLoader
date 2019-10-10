package com.gmail.justbru00.epic.maploader.webutil;

import java.io.File;

import com.gmail.justbru00.epic.maploader.main.EpicMapLoaderMain;

/**
 * This class handles web related connections.
 * @author justb
 *
 */
public class WebManager {
	
	private static String cacheFolderPath;
	private static String mapsFolderPath;
	
	public static void init() {
		cacheFolderPath = EpicMapLoaderMain.getInstance().getDataFolder().getAbsolutePath() + "@cache";
		cacheFolderPath = cacheFolderPath.replace("@", File.separator);
		
		mapsFolderPath = EpicMapLoaderMain.getInstance().getDataFolder().getAbsolutePath() + "@maps";
		mapsFolderPath = mapsFolderPath.replace("@", File.separator);
	}
	
	public static boolean downloadZip(String url, String pathToCorrectFolder) {
		// TODO Download zipped file from the url.
		return false; // Failed
	}

}
