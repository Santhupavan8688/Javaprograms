package Interview;

import java.util.Scanner;

public class countVowelsandConstonants {

	public static void main(String[] args) {
	 String str;
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the sentence:");
	 str=sc.nextLine();
	 String s=str.toLowerCase();
	 int vowel=0,consonant=0;
	 for(int i=0;i<s.length();i++) {
		 if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='u')
			 vowel++;
	 else if(s.charAt(i)>='a' && s.charAt(i)<='z')
		 consonant++;
		 
	 }
	 System.out.println("vowels: "+vowel);
	 System.out.println("consonant=: "+consonant);
	}

}
