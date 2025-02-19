package java_241220.test;

public class Computer {
	
	String cpu;
	String gpu;
	String motherboard;
	int rem;
	int power;
	
	Computer() {
		
	}
	
	Computer(String cpu, String gpu, String motherboard, int rem, int power) {
		this.cpu = cpu;
		this.gpu = gpu;
		this.motherboard = motherboard;
		this.rem = rem;
		this.power = power;
	}
	
	void specs(String cpu, String gpu, String motherboard, int rem, int power) {
		System.out.printf("CPU : %s\nGPU : %s\nMotherboard : %s\nRem : %dGB\nPower : %dW\n",
				cpu, gpu, motherboard, rem, power);
	}
	
}
