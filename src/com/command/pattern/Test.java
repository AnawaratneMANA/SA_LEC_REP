package com.command.pattern;

public class Test {
	public static void main(String[] args) {
		RemoteController remoteController = new RemoteController();
		
		Light livingRoomLight = new LivingRoomLight("Living Room Light");
		Light kitchenLight = new KitchenLight("Kitchen Light");
		
		LightOnCommand onLivingRoomLight = new LightOnCommand(livingRoomLight);
		LightOffCommand offLivingRoomLight = new LightOffCommand(livingRoomLight);
		remoteController.setCommand(onLivingRoomLight, offLivingRoomLight);
		remoteController.onButtonWasPushed();
		remoteController.offButtonWasPushed();
		
		LightOnCommand onKitchenLight = new LightOnCommand(kitchenLight);
		LightOffCommand offKitchenLight = new LightOffCommand(kitchenLight);
		remoteController.setCommand(onKitchenLight, offKitchenLight);
		remoteController.onButtonWasPushed();
		remoteController.offButtonWasPushed();

	}
}
