package Interview;

public class PalindromeorNot {

	public static void main(String[] args) {
		String s="reverse",reverse="";
		for(int i=s.length()-1;i>0;i--) {
			reverse= reverse+s.charAt(i);
		}
		if(s.equals(reverse)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}
