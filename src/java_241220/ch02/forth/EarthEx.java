package java_241220.ch02.forth;

public class EarthEx {

	public static void main(String[] args) {
		
//		제일 높은 건물의 높이는 ??? 입니다.
		
		System.out.println("제일 높은 건물의 높이는 " + Earth.TOP_BUILDING + " 입니다.");
		
		Earth earth = new Earth();
		
		System.out.println("제일 높은 건물의 높이는 " + earth.topBuilding + " 입니다.");
	}
	
}
