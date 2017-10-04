package com.import12.test;

public class Player {
	private int platerNo;
	private String playerName;
	public int getPlaterNo() {
		return platerNo;
	}
	public void setPlaterNo(int platerNo) {
		this.platerNo = platerNo;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	@Override
	public String toString() {
		return "player [platerNo=" + platerNo + ", playerName=" + playerName
				+ "]";
	}
	

}
