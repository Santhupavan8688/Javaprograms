package multithreading;

public class Multithreading extends Thread {
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("thread value is: "+Thread.currentThread().getName()+"value of i:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
	Multithreading th1 = new Multithreading();
	Multithreading th2 = new Multithreading();
	th1.start();
	try {
		th1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	th2.start();

	}

}
