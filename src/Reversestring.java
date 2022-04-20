import java.util.Scanner;

public class Reversestring {

	public static void main(String[] args) {
		String s ="";
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char d[]= s.toCharArray();
		int size = d.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[size-1-i]=d[i];
			i++;
		}
		System.out.println(d);
		System.out.println(a);
	}

}
