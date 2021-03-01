package com.command.pattern;

public class RemoteController {
	
	Command onCommand;
	Command offCommand;
	
	public void setCommand(Command onCommand, Command offCommand) {
		this.onCommand = onCommand;
		this.offCommand = offCommand;
	}
	
	//Method 1
	public void onButtonWasPushed() {
		this.onCommand.execute();
	}
	
	//Method 2
	public void offButtonWasPushed() {
		this.offCommand.execute();
	}
}
