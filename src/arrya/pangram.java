package arrya;

public class pangram {

	public static void main(String[] args) {
	String s="The quick brown fox jumps over the lazy dog";
	s.toUpperCase();
	int c=0;
	for(int i=65;i<=90;i++) {
		if(s.contains(""+(char)i)) {
			c++;
		}
	}
	if(c==26) {
		System.out.println("it is a pangram");
	}
	else {
		System.out.println("not a pangram");
	}

	}

}
