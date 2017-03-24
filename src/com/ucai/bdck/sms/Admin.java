package com.ucai.bdck.sms;

public class Admin extends Emp {
	private String car;

	public Admin() {
		super();
	}

	public Admin(String name, int id, int sal , String car) {
		super();
		this.car = car;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
	}
	
	
	

}
