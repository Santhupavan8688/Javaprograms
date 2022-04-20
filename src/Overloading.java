
class add{
	public static int add(int a,int b) {
		return a+b;
	}
	public static int add(int a,int b,int c) {
		return a+b+c;
	}
}
public class Overloading {

	public static void main(String[] args) {
		System.out.println(add.add(10, 24));
		System.out.println(add.add(10, 24, 34));
		

	}

}

