package com.jainilsutaria.api.bukkit;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

public class BukkitAPI extends JavaPlugin {

	private FileConfiguration config; 
	
	@Override
	public void onEnable() {
		loadDefaults();
		registerServer();
		config = getConfig();
		checkLoad();
	}

	private void checkLoad() {
		
	}

	private void registerServer() {

	}
	
	private void loadDefaults() {
		config.addDefault("server-name", this.getServer().getName());
		config.addDefault("bungee-ip", "localhost");
		config.addDefault("connection-port", -1);
		config.options().copyDefaults(true);
		saveConfig();
	}
}
