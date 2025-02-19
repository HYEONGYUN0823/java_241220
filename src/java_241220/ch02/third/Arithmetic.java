package java_241220.ch02.third;

public class Arithmetic {
	
	int a;
	int b;
	
	Arithmetic() {
		
	}
	
	Arithmetic(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	static void plus(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
	
}
