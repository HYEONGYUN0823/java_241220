package java_241220.ch03.first;

public class DmbCellPhoneEx {

	public static void main(String[] args) {
		
//		CellPhone cellphone = new CellPhone();
//		
//		cellphone.model = "SAMSUNG";
//		cellphone.color = "Black";
//		
//		System.out.println(cellphone.model);
//		
//		CellPhone cellphone1 = new CellPhone();
//		
//		cellphone1.model = "iPhone";
//		cellphone1.color = "16";
//		
//		System.out.println(cellphone1.model);
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		dmbCellPhone.model = "SAMSUNG2";
		dmbCellPhone.color = "BLACK2";
		System.out.println(dmbCellPhone.model);
		dmbCellPhone.powerOn();
		dmbCellPhone.powerOff();
		
		CellPhone cellphone2 = new CellPhone("iPhone 16e", "Black");
		System.out.println(cellphone2.model);
	}
	
}
