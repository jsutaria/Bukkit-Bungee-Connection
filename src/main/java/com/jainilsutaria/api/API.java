package com.jainilsutaria.api;

import java.util.HashSet;
import java.util.Set;

import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.plugin.Plugin;

public class API {

	private API_Type type;
	private Plugin bungeeplugin;
	private JavaPlugin bukkitplugin;
	
	private Set<API_Server> servers = new HashSet<API_Server>();
	private Set<API_Player> players = new HashSet<API_Player>();
	
	public API(Plugin plugin) {
		this.type = API_Type.BUNGEE;
		this.bungeeplugin = plugin;
		this.bukkitplugin = null;
	}
	
	public API(JavaPlugin plugin) {
		this.type = API_Type.BUNGEE;
		this.bukkitplugin = plugin;
		this.bungeeplugin = null;
	}
	
	public API_Type getType() {
		return this.type;
	}
	
	public Object getPlugin() {
		return 	this.type.equals(API_Type.BUKKIT) ?
				bukkitplugin : bungeeplugin;
	}
	
	public Set<API_Server> getServers() {
		return this.servers;
	}
	
	public Set<API_Player> getPlayers() {
		return this.players;
	}
}
