package com.ucai.bdck.sms;

public class Mana extends Emp {
	private String position;
	private int bounds;
	
	public Mana() {
		super();
	}

	public Mana(String position, int bounds) {
		super();
		this.position = position;
		this.bounds = bounds;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getBounds() {
		return bounds;
	}

	public void setBounds(int bounds) {
		this.bounds = bounds;
	}
	
	
	

}
