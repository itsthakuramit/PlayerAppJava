package com.stackroute.playerapp;

import com.stackroute.playerapp.model.Player;
import com.stackroute.playerapp.service.PlayerService;
import com.stackroute.playerapp.service.PlayerServiceImpl;

public class MainApp {

	public static void main(String[] args) {
		
		Player player1 = new Player("pl001", "Anand", "Chess");
		Player player2 = new Player("pl002", "Sachin", "Cricket");
		Player player3 = new Player("pl003", "Kohli", "Tennis");
		Player player4 = new Player("pl004", "Rohit", "FootBall");
		
		PlayerService playerService = new PlayerServiceImpl();
		playerService.addPlayer(player1);
		playerService.addPlayer(player2);
		playerService.addPlayer(player3);
		playerService.addPlayer(player4);
		
		
		for(Player pl: playerService.getAllPlayers()) {
			System.out.println(pl);
		}
		
		System.out.println("\n=====After Deletion====\n");
		
		for(Player pl: playerService.deletePlayer(player4)){
			System.out.println(pl);
		}
		
		System.out.println("\n=====After Updation====\n");
		
		for(Player pl: playerService.updatePlayer(player1)){
			System.out.println(pl);
		
		}
		
	}
	
	
}
