package java_241220.test.test01;

public class Ex {
	
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone("dddd1", "dddd2");
		
		iphone.version();
		iphone.sayName();
		
		AirPorts airports = new AirPorts("cccc1", "cccc2");
		
		airports.version();
		airports.sayName();
	}
	
}
