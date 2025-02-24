package java_241220.ch04.fifth;

public class People {
	
	public static void main(String[] args) {
		
		User user = new User();
		Admin admin = new Admin();
		
		Member member = admin;
		member.showMyName();
		
		member = user;
		
	}
	
}
