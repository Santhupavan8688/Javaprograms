package arrya;

public class Countofwords {
	public static void main(String[] args) {
		String str = "hai how are you";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' ')
				count++;
		}
		System.out.println(" no of words are : "+(count+1));
		
	}

}
