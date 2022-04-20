package arrya;

public class Characterpattern {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++) {
			int alphabet=65;
			for(int j=0;j<=i;j++) {
				System.out.print((char)(alphabet+j)+" ");
			}
			for(int k=i-1;k>=0;k--) {
				System.out.print((char)(alphabet+k)+" ");
			}
			for(int l=i-5;l>=0;l--) {
				System.out.print((char)(alphabet+l)+" ");
			}
			System.out.println();
		}
	}

}
