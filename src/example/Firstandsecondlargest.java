package example;

public class Firstandsecondlargest {

	public static void main(String[] args) {
		int[]arr = {45,25,14,88,44,26};
		int first =0;
		int second =0;
		for(int i=0;i<arr.length;i++) {
			if(first<arr[i]) {
				second=first;
				first=arr[i];
			}
			else if(second<arr[i]) {
				second=arr[i];
			}
				
			
		}
		System.out.println("first largest: "+first+"second largest: "+second);

	}

}
