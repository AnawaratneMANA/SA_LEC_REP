package com.command.pattern;

public class LivingRoomLight implements Light{
	
	String light;
	//Constructor
	public LivingRoomLight(String name) {
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
