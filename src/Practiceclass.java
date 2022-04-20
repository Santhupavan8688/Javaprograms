
public class Practiceclass {
 int a;
 int b;
 public void add(){
	 a=10;
	 b=20;
	int c=a+b;
	 System.out.println("addition :"+c);
	 
 }
 public int add1() {
	 a=24;
	 b=45;
	 int c=a+b;
	 return c;
	 
 }
 public void sub() {
	 int temp = this.add1();
	 System.out.println("temp value :"+temp);
	 int subvalue = temp-800;
	 System.out.println("sub:"+subvalue);
 }
	public static void main(String[] args) {
		
		Practiceclass iv = new Practiceclass();
		iv.add();
		iv.sub();
		int maintemp =iv.add1();
		System.out.println("maintemp"+maintemp);
		iv.a=45;
		iv.b=75;
		System.out.println(""+(iv.a+iv.b));
	
	}

}