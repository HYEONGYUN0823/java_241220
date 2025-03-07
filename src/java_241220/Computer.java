package java_241220;

public class Computer extends Calculator {
	@Override
	public double calculate(double radius) {
		return Constants.PAI_2 * radius * radius;
	}
}
