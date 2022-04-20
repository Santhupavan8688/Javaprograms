package arrya;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Hashmap {
private static void hahashmap() {
	Map<Integer,String>hm=new HashMap<Integer,String>();

	hm.put(101, "rama");
	hm.put(102, "kaviths");
	hm.put(104, "anil");
	hm.put(104, "mounitha");
	hm.put(102, "lavanya");
	hm.put(105,null);
	System.out.println("after using the put elements");
	for(Map.Entry<Integer,String> m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
		System.out.println("=====================");	
	}

private static void linkedhashmap() {
	Map<Integer,String>hm=new LinkedHashMap<Integer,String>();
	
	hm.put(101, "rama");
	hm.put(102, "kaviths");
	hm.put(104, "anil");
	hm.put(103, "lavanya");
	hm.put(102, "lavanya");
	hm.put(105,null);
	System.out.println("after using the put elements");
	for(Map.Entry<Integer,String> m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	System.out.println("=================");
	}
private static void treemap() {
	Map<Integer,String>hm=new TreeMap<Integer,String>();

	hm.put(101, "rama");
	hm.put(102, "kaviths");
	hm.put(104, "anil");
	hm.put(103, "lavanya");
	hm.put(102, "lavanya");
	hm.put(105, "rajesh");
	System.out.println("after using the put elements");
	for(Map.Entry<Integer,String> m:hm.entrySet()) {
		System.out.println(m.getKey()+" "+m.getValue());
	}
	
	
}


	public static void main(String[] args) {
		hahashmap();
		linkedhashmap();
		treemap();
		
}

	
	

	
}
