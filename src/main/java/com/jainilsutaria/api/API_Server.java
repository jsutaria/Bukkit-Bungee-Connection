package com.jainilsutaria.api;

import java.util.HashSet;
import java.util.Set;

public class API_Server {
	
	private Set<API_Player> players = new HashSet<API_Player>();

	public Set<API_Player> getPlayers() {
		return players;
	}
	
}
