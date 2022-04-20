package arrya;

import java.util.Arrays;
import java.util.Collections;

public class Reversearry {
	
	static void reverse (Integer a[])
	{
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer [] a= {4,3,2,1};
reverse(a);
	}

}
