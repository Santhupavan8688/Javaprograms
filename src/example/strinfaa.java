package example;

public class strinfaa {
	public static void main(String[] args) {
		
	
	String word = "ravi was one of best student in collage days";

	String splitArr[] = word.split(" ");

	String str ="";

	System.out.println(splitArr.length);
	for(int i=splitArr.length-1;i>=0;i--){

	str = str + splitArr[i] + " ";

	}

	System.out.println(str);
	}

	}

