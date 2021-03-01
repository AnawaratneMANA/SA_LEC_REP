package com.command.pattern;

public class LightOffCommand implements Command{
	
	Light light;
	
	//Constructor.
	public LightOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}