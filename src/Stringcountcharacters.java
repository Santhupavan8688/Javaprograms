import java.util.Scanner;

public class Stringcountcharacters {
	static final int MAX_CHAR = 256;
	static void countchar(String str) {
		int count[]=new int[MAX_CHAR];
		int len = str.length();
		for(int i=0;i<len;i++) {
			count[str.length()]++;
			char ch[]=new char[str.length()];
			for(  int k =0;k<len;k++) {
				ch[i]=str.charAt(k);
				int find=0;
				for(int j=0;j<=k;j++) {
					if(str.charAt(k)==ch[j])
						find++;
				}
				if(find==1)
					System.out.println("number of occurence of"+str.charAt(k)+"is:"+count[str.charAt(k)]);;
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "SON GOKU IS WORD";
		countchar(str);
		
	}

}
