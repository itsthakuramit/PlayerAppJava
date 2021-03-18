package com.stackroute.playerapp.model;

public class Player {

	private String playerid;
	private String playername;
	private String sports;

	public Player(String playerid, String playername, String sports) {
		super();
		this.playerid = playerid;
		this.playername = playername;
		this.sports = sports;
	}
	
	public String getPlayerid() {
		return playerid;
	}
	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}
	public String getPlayername() {
		return playername;
	}
	public void setPlayername(String playername) {
		this.playername = playername;
	}
	public String getSports() {
		return sports;
	}
	public void setSports(String sports) {
		this.sports = sports;
	}
	@Override
	public String toString() {
		return "Player [playerid=" + playerid + ", playername=" + playername + ", sports=" + sports + "]";
	}
	
	
	
}
