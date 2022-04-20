package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import Interviews.a;

public class Arrayclass {

	public static void main(String[] args) {
		ArrayList<Integer> h = new ArrayList<>(Arrays.asList(14,15,2,4,6));
		Collections.sort(h, Collections.reverseOrder());
		System.out.println(h.get(3));
	      /* ArrayList<Integer> a = new ArrayList<>(h);
	      System.out.println(a.get(1));*/
		
		Map<Integer,String>hm = new HashMap<>();
		hm.put(1,"pavu");
		hm.put(2,"ramu");
		hm.put(2,"pavu");
		for(Map.Entry<Integer,String> ar: hm.entrySet())
		{
			System.out.println(ar.getKey()+" "+ar.getValue());
		}
	   
		// TODO Auto-generated method stub

	}

}
