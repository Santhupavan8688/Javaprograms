import java.util.Scanner;

public class Countofwordsstartwithcapitalwords {

	public static void main(String[] args) {
		String s = new String();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the line");
		s=sc.nextLine();
		char ch;
		int c=0;
		for(int i=0;i<=s.length();i++) {
			ch=s.charAt(i);
			if(ch>=65 && ch<=90) {
				c++;
			}
		}
		System.out.println("Total no of capital words:"+c);
		

	}

}
