package Interview;

import java.util.Scanner;

public class Printfirsttolastword {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the sentence :");
		String s=sc.nextLine();
		String words[]=s.split("[ ]+");
		System.out.println(words[words.length-2]);

	}

}
