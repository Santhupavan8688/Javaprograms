package arrya;

public class Maxmiumandminimumarray {

	public static void main(String[] args) {
	int[]arr= new int []{24,45,55,64,44};
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<arr.length;i++) {
		if(max<=arr[i]) {
			max = arr[i];
					} else 
			if(min>=arr[i]) {
				min=arr[i];
				
				
			
		}
		
	}
	System.out.println("max "+max);
	System.out.println("min"+min);

	}

}
