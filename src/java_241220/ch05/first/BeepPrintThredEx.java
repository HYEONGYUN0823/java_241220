package java_241220.ch05.first;

import java.awt.Toolkit;

public class BeepPrintThredEx {

	public static void main(String[] args) {
		
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		
//		Thread thread = new Thread(new Runnable() {
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();
//				for (int i = 0; i < 5; i++) {
//					toolkit.beep();
//					try {
//						Thread.sleep(500);
//					} catch (Exception e) {
//						
//					}
//				}
//			}
//		});
		
		thread.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
		
	}
	
}
