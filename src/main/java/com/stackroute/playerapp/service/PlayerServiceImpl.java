package com.stackroute.playerapp.service;


import java.util.List;
import com.stackroute.playerapp.repository.PlayerReposistory;
import com.stackroute.playerapp.model.Player;

public class PlayerServiceImpl implements PlayerService {
	
	PlayerReposistory playerRepository = new PlayerReposistory();
	
	public void addPlayer(Player player) {
		 playerRepository.add(player);
	}
	
	public List<Player> getAllPlayers() {
		 return playerRepository.getAllPlayers();
	}

	public List<Player> deletePlayer(Player player) {		
		return playerRepository.deletePlayer(player);
	}

	public List<Player> updatePlayer(Player player) {
		return playerRepository.updatePlayer(player);
	}
	
	

}
