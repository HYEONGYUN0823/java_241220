package java_241220.ch02.third;

public class ArithmeticEx {
	
	public static void main(String[] args) {
		
		int a = 7;
		int b = 8;
		
		System.out.println(a + " + " + b + " = " + (a + b));
		
//		plus(7, 8);
		
		Arithmetic arithmetic = new Arithmetic();
		
		arithmetic.plus(7, 8);
		
//		System.out.println(arithmetic.a + arithmetic.b);
	}
	
//	static void plus(int a, int b) {
//		System.out.println(a + " + " + b + " = " + (a + b));
//	}
	
}
