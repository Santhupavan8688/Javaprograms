package example;

public class Recursionfact {

	public static void main(String[] args) {
		int n=5;
		int result=fact(n);
		System.out.println("factorial is "+result);
	}

	static int fact(int n) {
		if(n<=1)
			return 1;
		else
		return n*fact(n-1);
	}

}
