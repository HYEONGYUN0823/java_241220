package java_241220;

public class ComputerExample {

	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		Computer computer = new Computer();
		
		double radius = 7;
		
		System.out.println("원의 반지름: " + radius);
		System.out.println("\nCalculator 객체의 원면적 구하는 프로그램 실행\n원면적: " + calculator.calculate(radius));
		System.out.println("\nComputer 객체의 원면적 구하는 프로그램 실행\n원면적: " + computer.calculate(radius));

	}

}
