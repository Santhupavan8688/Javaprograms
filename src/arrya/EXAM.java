package arrya;

public class EXAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="ramuramana";
		char arr[]=new char[256];
		for(int i=0;i<s1.length();i++) {
			if(arr[s1.charAt(i)]==0)
				arr[s1.charAt(i)]++;
		}
			for(int i=0;i<s1.length();i++) {
				if(arr[s1.charAt(i)]!=0) {
					System.out.print(s1.charAt(i));
					arr[s1.charAt(i)]=0;
			
				}
			}

	}

}
