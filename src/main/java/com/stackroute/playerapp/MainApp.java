package com.stackroute.playerapp;

import com.stackroute.playerapp.model.Player;
import com.stackroute.playerapp.service.PlayerService;
import com.stackroute.playerapp.service.PlayerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		
		Player player1 = new Player("pl001", "Anand", "Chess");
		Player player2 = new Player("pl002", "Sachin", "Cricket");
		
		
		PlayerService playerService = new PlayerServiceImpl();
		playerService.addPlayer(player1);
		playerService.addPlayer(player2);
		
		
		for(Player pl: playerService.getAllPlayers()) {
			System.out.println(pl);
		}
		
		
		
	}
	
	
}
