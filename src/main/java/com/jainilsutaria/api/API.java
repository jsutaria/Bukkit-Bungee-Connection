package com.jainilsutaria.api;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.plugin.Plugin;

public class API {

	private static API instance;
	
	public static API getInstance() {
		return instance;
	}
	private JavaPlugin plugin;
	
	private Set<API_Server> servers = new HashSet<API_Server>();
	private Set<API_Player> players = new HashSet<API_Player>();
		
	public API(JavaPlugin plugin) {
		this.plugin = plugin;
		instance = this;
	}
	
	public JavaPlugin getPlugin() {
		return this.plugin;
	}
	
	public Set<API_Server> getServers() {
		return this.servers;
	}
	
	public Set<API_Player> getPlayers() {
		return this.players;
	}
}
