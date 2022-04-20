import java.util.HashMap;
import java.util.Iterator;

public class Stringdouble {
static void findtheduplicatewords(String str) {
	 HashMap<String,Integer> hm = new HashMap<>();
	String[] s =str.split(" ");
		for(String tempstring : s) {
			if (hm.get(tempstring)!=null) {
				hm.put(tempstring, hm.get(tempstring)+1);
				
			}else {
			hm.put(tempstring, 1);
			}
			
		}
	Iterator<String> tempstring =	hm.keySet().iterator();
	while (tempstring.hasNext()) {
		String temp = tempstring.next();
		if (hm.get(temp)>1) {
			System.out.println("the word " +temp+" apperance "+hm.get(temp)+" no of times");
		}
	}
		
	}
static void findtheduplicatecharcters(String str) {
	HashMap<Character, Integer>  hm = new HashMap<>();
	for(int i =0;i<str.length();i++) {
		char c = str.charAt(i);
		if (hm.get(c)!=null) {
			hm.put(c,hm.get(c)+1);
			
		}
		else {
			hm.put(c, 1);
		}
	}
	System.out.println(hm);
	
}



	public static void main(String[] args) {
		findtheduplicatewords("i am am learning a a java java");
		findtheduplicatecharcters("javaj2ee");
	}


  
	
}
