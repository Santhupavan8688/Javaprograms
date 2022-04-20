package arrya;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Mapexp{

	public static void main(String[] args) {
		List<String>li=new ArrayList<String>();
		li.add("java is oops");
		li.add("java is a robust");
		li.add("multithreading");
		Map<String, List<String>> mp= new HashMap();
		mp.put("what is java", li);
		Iterator it = mp.keySet().iterator();
		while(it.hasNext()) {
			String key =(String) it.next();
			List<String> vals = mp.get(key);
			System.out.println("key is :"+key);
			Iterator vit = vals.iterator();
			while(vit.hasNext()) {
				System.out.println("values are :"+vit.next());
			}
		}
	

	}

}
