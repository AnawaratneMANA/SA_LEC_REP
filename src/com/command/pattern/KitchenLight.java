package com.command.pattern;

public class KitchenLight implements Light{
	
	String light;
	
	//Constructor.
	public KitchenLight(String name) {
		this.light = name;
	}

	@Override
	public void on() {
		System.out.println("Turn on " + light);
	}

	@Override
	public void off() {
		System.out.println("Turn off " + light);
	}

}
