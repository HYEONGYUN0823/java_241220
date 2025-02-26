package java_241220.ch08.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		
//		ArrayList<String> friends = new ArrayList<>();
		List<String> friends = new ArrayList<>();
		
		System.out.println("test.size(): " + friends.size());
		
		friends.add("Tony");
		friends.add("Tiffany");
		friends.add("Jeniffer");
		friends.add("John");
		friends.add("Tom");
		friends.add("Andrew");
		friends.add("Tiger");
		friends.add("Selly");
		
		System.out.println("test.size(): " + friends.size());
		
		for (int i = 0; i < friends.size(); i++) {
			System.out.println("test.get(i): " + friends.get(i));
		}
		
		for (String friend: friends) { // 향상된 for 문
			System.out.println("a: " + friend);
		}
		
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		
//		System.out.println("test.size(): " + test.size());
		
	}
	
}
