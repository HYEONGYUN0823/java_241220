package java_241220.ch04.third;

public class TelevisionEx {
	
	public static void main(String[] args) {
		
		Television television = new Television();
		television.turnOn();
		
		SettopBox settopBox = new SettopBox();
		settopBox.turnOn();
		
		RemoteControl remoteControl = new SettopBox();
		remoteControl.turnOn();
		
		remoteControl = new Television();
		remoteControl.turnOn();
		remoteControl.turnOff();
		
		remoteControl = new SettopBox();
		remoteControl.turnOff();
		
	}
	
}
