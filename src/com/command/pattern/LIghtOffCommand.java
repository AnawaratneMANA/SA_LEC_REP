package com.command.pattern;

public class LIghtOffCommand implements Command{
	
	Light light;
	
	//Constructor.
	public LIghtOffCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

}