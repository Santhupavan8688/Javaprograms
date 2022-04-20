package multithreading;
public class Thread1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
		System.out.println(" thread i value is:"+i+"thread current class "+Thread.currentThread().getName()+Thread.currentThread().getPriority());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("deamon is work");
		}
		else {
			System.out.println("user thread");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public static void main(String[]args) {
		Thread1 th = new Thread1();
		Thread1 t = new Thread1();
		th.setName("santhu");
		t.setName("roman");
		th.setPriority(8);
		t.setPriority(8);
		th.setDaemon(true);
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t.start();
	}
}


