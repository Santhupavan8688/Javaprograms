package example;

import java.util.Arrays;

public class CountString {

	 public static String sortString(String inputString) 
	    { 
	        // convert input string to char array 
	        char tempArray[] = inputString.toCharArray(); 
	          
	        // sort tempArray 
	        Arrays.sort(tempArray); 
	          
	        // return new sorted string 
	        return new String(tempArray); 
	    } 
	      
	    // Driver method 
	    public static void main(String[] args) 
	    { 
	        String inputString = "geeks for geeks"; 
	        String outputString = sortString(inputString.split("\\s")); 
	          
	        System.out.println("Input String : " + inputString); 
	        System.out.println("Output String : " + outputString); 
	    }

		private static String sortString(String[] split) {
			// TODO Auto-generated method stub
			return null;
		} 

}
