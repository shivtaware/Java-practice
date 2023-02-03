class Add extends Thread
{
	int num1= 3;
	int num2= 4;
	 public void run() {
		 for (int i = 0; i < 5; i++) {
			 System.out.println(num1+num2);
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("error");
				}
		}
		
	 }
}

class Sub extends Thread{
	int num1=4;
	int num2=3;
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(num1-num2);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
		}
		
		
	}
}

public class MultiThreading {

	public static void main(String[] args) throws InterruptedException {
		Add a1=new Add();
		Sub a2=new Sub();
		
		a1.start();
		Thread.sleep(10);
		a2.start();
		
	}
	
}
