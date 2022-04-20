
public class Variablesandmethods {
	int a;
	int b;
	public void add1(){
		a=14;
		b=24;
		int c = a+b;
		System.out.println("addition:"+c);
		
	}
	public int add () {
		a=24;
		b=35;
		int c=a+b;
		return c;
		
	}
	public void sub () {
		int temp = this.add();
		System.out.println("temp vale:"+temp);
		int sub = temp-20;
		System.out.println("sub:"+sub);
	
	}

	public static void main(String[] args) {
		Variablesandmethods iv = new Variablesandmethods();
		iv.sub();
		iv.add1();
		int maintemp=iv.add();
		System.out.println("main temp :"+maintemp);
		iv.a=24;
		iv.b=34;
		System.out.println("addition:"+(iv.a+iv.b));
		

	}

}
