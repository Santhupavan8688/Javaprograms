package multithreading;

public class Reserved implements Runnable{
	int available=1;
	int wanted=1;
	public synchronized void run() {
		if(wanted<=available) {
			System.out.println("seats available:"+Thread.currentThread().getName());
			available = available-wanted;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
				
			}
		else {
			System.out.println("seats no availble:"+Thread.currentThread().getName());
		}
		}
		
	

	public static void main(String[] args) {
		Reserved rs = new Reserved();
		Thread t1=new Thread(rs);
		Thread t2=new Thread(rs);
		t1.setName("santhu");
		t2.setName("rajesh");
		t1.start();
		t2.start();

	}


}
