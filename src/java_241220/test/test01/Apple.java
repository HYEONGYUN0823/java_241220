package java_241220.test.test01;

public class Apple {
	
	String firmware;
	String name;
	
	Apple(String firmware, String name) {
		this.firmware = firmware;
		this.name = name;
	}
	
	void version() {
		System.out.println("현재 펌웨어 버전은" + firmware + "입니다.");
	}
	
	void sayName() {
		System.out.println("제품명 : " + name);
	}
}
