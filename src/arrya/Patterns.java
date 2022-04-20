package arrya;

public class Patterns {
	private static void starpattern() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" x");
			}
			System.out.println();
		}
		for(int i= 1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" x");
			}
			System.out.println();
		}
		System.out.println("========================");
	}

	/*private static void pyramidpattern() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("x");
			}
			for(int l=2;l<=i;i++) {
				System.out.print("x");
			}
			System.out.println();
		}
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("");
			}
			for(int k=5;k>=i;k--) {
				System.out.print("x");
			}
			for(int l=4;l>=i;l--) {
				System.out.print("x");
			}
			System.out.println();
		}
	
	}*/
	/*private static void pattern() {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++ ) {
				System.out.print(" x");
			}
			System.out.println();
		}
		
		
	}*/
	
	public static void main(String[] args) {
		starpattern();
		/*pyramidpattern();*/
		
		/*pattern();*/
	}



}
