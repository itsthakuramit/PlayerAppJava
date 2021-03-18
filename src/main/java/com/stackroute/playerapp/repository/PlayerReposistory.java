package com.stackroute.playerapp.repository;

import java.util.ArrayList;
import java.util.List;
import com.stackroute.playerapp.model.Player;

public class PlayerReposistory {

	List<Player> playerlist = new ArrayList<Player>();
	
	public void add(Player player) {
		playerlist.add(player);
	}

	public List<Player> getAllPlayers() {
		return playerlist;
	}

	public List<Player> deletePlayer(Player player) {
		return null;
	}

	public List<Player> updatePlayer(Player player) {
		return null;
	}
	
}
