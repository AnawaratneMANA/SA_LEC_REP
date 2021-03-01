package com.command.pattern;

public class LightOnCommand implements Command{
	
	Light light;
	
	//Constructor.
	public LightOnCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
	}

}
