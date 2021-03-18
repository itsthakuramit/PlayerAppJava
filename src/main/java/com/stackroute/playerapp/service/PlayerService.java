package com.stackroute.playerapp.service;

import java.util.List;

import com.stackroute.playerapp.model.Player;

public interface PlayerService {

	public void addPlayer(Player player);
	public List<Player> getAllPlayers();
	public List<Player> deletePlayer(Player player);
	public List<Player> updatePlayer(Player player);
	
	
}
