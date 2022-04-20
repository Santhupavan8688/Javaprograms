import java.util.Scanner;

public class Palindromeofstring {

	public static void main(String[] args) {
		String s="";
		System.out.println("Enter the number of strings:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		char d[]=s.toCharArray();
		int size=d.length;
		char a[]=new char[size];
		int i=0;
		while(i!=size) {
			a[size-i-1]=d[i];
			i++;
		}
		i=0;
		while(i!=size) {
			if(a[i]!= d[i]) 
			{
				System.out.println("not a palindrome");
				System.exit(0);
			}
			else {
				i++;
				System.out.println("a palindrome");		
				return;
		}
			
	}
		
		
		
	}

	
}


