package java_241220.ch06.first;

public class BoxEx {

	public static void main(String[] args) {
		
//		Box box = new Box();
//		
//		box.a = 1;
//		
//		System.out.println(box.a);
		
		Box<Integer> box = new Box<>();
//		Box<Integer> box = new Box<Integer>();
		box.setT(1);
		
		System.out.println(box.getT());
		
//		Box<int> box2 = new Box<>(); 에러
		
		Box<String> box3 = new Box<>();
		box3.setT("Tony");
		System.out.println(box3.getT());
		
	}
	
}
