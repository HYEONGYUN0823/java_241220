package java_241220.test.test00;

public class test {
	
	public static void main(String[] args) {
		
		int score = 0;
		
		for (int i = 1; i <= 300; i++) {
			if (i % 3 == 0) {
				score = i;
				System.out.println(score);
			}
		}
		
	}
	
}
