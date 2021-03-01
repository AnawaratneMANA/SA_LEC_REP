package com.command.pattern;

public class LivingRoomLight implements Light{

	@Override
	public void on() {
		System.out.println("Turn on Living Room Light");
	}

	@Override
	public void off() {
		System.out.println("Turn off Living Room Light");
	}

}
