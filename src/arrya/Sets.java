package arrya;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
	private static void hashset() {
		HashSet set =new HashSet();
		set.add("apple");
		set.add(10);
		set.add("pink");
		set.add("orange");
		set.add("42.5d");
		set.add(null);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
	
		}
		System.out.println("=============");
	}
	
	private static void treeset() {
		TreeSet set =new TreeSet();
		set.add("apple");
		//set.add(10);
		set.add("pink");
		set.add("orange");
		//set.add("42.5d");
		//set.add(null);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("==============");
		
	}
	private static void linkedhashset() {
		
		LinkedHashSet set =new LinkedHashSet();
		set.add("apple");
		set.add(10);
		set.add("pink");
		set.add("orange");
		set.add("42.5d");
		set.add(null);
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}


	public static void main(String[] args) {
		hashset();
		treeset();
		linkedhashset();
	}

	

	

	
}
