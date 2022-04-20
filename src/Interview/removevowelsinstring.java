package Interview;

import java.util.Scanner;

public class removevowelsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String st;
Scanner sc= new Scanner(System.in);
System.out.println("enter the string words: ");
st=sc.nextLine();
System.out.println("remove vowel of string: "+st.replaceAll("[AEIOUaeiou]", ""));
	}

}
