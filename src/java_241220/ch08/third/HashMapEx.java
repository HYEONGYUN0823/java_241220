package java_241220.ch08.third;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("장원영 키", 170);
		friends.put("전지현 키", 171);
		friends.put("장돈건 키", 172);
		friends.put("고소영 키", 173);
		friends.put("최은경 키", 174);
		
//		friends.remove("최은경 키");
		
		for (String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			
			System.out.println(strKey + ": strValue: " + strValue);
		}
		
	}
	
}
