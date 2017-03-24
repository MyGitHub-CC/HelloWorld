package com.ucai.bdck.sms;

public class Tech extends Emp {
	private String team;
	private int comm;
	
	public Tech() {
		super();
	}

	public Tech(String team, int comm) {
		super();
		this.team = team;
		this.comm = comm;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getComm() {
		return comm;
	}

	public void setComm(int comm) {
		this.comm = comm;
	}
	
}
