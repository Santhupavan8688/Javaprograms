import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrAYLIST {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(5);
		al.add(1);
		al.add(2);
		System.out.println(""+al.size());
		System.out.println("count times of 1:"+Collections.frequency(al, 1));
		System.out.println(" count times of 2:"+Collections.frequency(al, 2));
		System.out.println(" count times of 3 :"+Collections.frequency(al, 3));
		System.out.println(" count times of 4:"+Collections.frequency(al, 4));
		System.out.println(" count times of 5:"+Collections.frequency(al, 5));
		System.out.println("max value :"+Collections.max(al));
		System.out.println("min value :"+Collections.min(al));
		
		
		
		
	}}

		  

