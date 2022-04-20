package example;
class display{
	public void wish(int n) {
		synchronized (this) {
			for(int i=1; i<=5;i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
		}
	}
}
class mythread1 extends Thread{
	display t;
	mythread1(display t){
		this.t=t;	
	}
	public void run() {
		t.wish(5);
	}
}
public class Synchronisedblock {

	public static void main(String[] args) {
		display t = new display();
		mythread1 t1 = new mythread1 (t);
		t1.start();
		

	}

}
