package arrya;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		LinkedList<Integer>li = new LinkedList<Integer>();
		li.add(10);
		li.add(0, 20);
		li.add(30); 
		li.add(50);
		ListIterator<Integer> it=li.listIterator();
				while(it.hasNext()) {
					System.out.println("elements :"+it.next());
				}
		while(it.hasPrevious()) {
			System.out.println("reverse:"+it.previous());
			
		}
		
		}

}
