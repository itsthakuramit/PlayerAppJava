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
		
		for(Player p: playerlist){
			if(player.getPlayerid().equals(p.getPlayerid())) {	
					playerlist.remove(p);
					break;
			}
		}
		return playerlist;
	}

	public List<Player> updatePlayer(Player player) {
		
		for(Player p: playerlist){
			if(player.getPlayerid().equals(p.getPlayerid()))	{
					String str= "Harsh";
					p.setPlayername(str);
					break;
				}
		}
		return playerlist;
		
	}
	
}
