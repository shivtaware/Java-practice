//public class MultiThreadingRunnable {
//	public static void main(String[] args) throws InterruptedException {
//		Runnable a1=()-> {
//				int num1= 3;
//				int num2= 4;
//				for (int i = 0; i < 5; i++) {
//					System.out.println(num1+num2);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						System.out.println("error");
//					}
//				}
//			};			
//		Runnable a2=()->  {
//				int num1=4;
//				int num2=2;
//				for (int i = 0; i < 5; i++) {
//					System.out.println(num1-num2);
//					try {
//						Thread.sleep(1000);
//					} catch (InterruptedException e) {
//						System.out.println("error");
//					}
//				}
//			};
//		Thread t1=new Thread(a1);
//		Thread t2= new Thread(a2);
//		t1.start();
//		Thread.sleep(5);
//		t2.start();
//		t1.join();
//		t2.join();
//		System.out.println("Bye");
//	}
//}

public class MultiThreadingRunnable {
	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new Thread(() -> {
			int num1 = 3;
			int num2 = 4;
			for (int i = 0; i < 5; i++) {
				System.out.println(num1 + num2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("error");
				}
			}
		});
		Thread t2 = new Thread(() -> {
			int num1 = 4;
			int num2 = 2;
			for (int i = 0; i < 5; i++) {
				System.out.println(num1 - num2);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("error");
				}
			}
		});
		t1.start();
		Thread.sleep(5);
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Bye");
	}
}