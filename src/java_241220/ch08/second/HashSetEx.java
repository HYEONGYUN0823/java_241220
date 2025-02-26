package java_241220.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> computerLangs = new HashSet<>();
		
		// 출력문: 향상된 for 문
		
		computerLangs.add("HTML");
		computerLangs.add("Bootstrap");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("JavaScript");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		
		for (String computerLang: computerLangs) {
			System.out.println("computerLang: " + computerLang);
		}
		
	}
	
}
