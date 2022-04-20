import java.util.HashMap;
import java.util.Map;

public class HAshmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map= new HashMap<Integer,String>();
		map.put(1, "a");
		map.put(2, "b");
		map.put(3, "a");
		map.put(1, "b");
		
		for(Map.Entry<Integer,String>hm:map.entrySet()) {
			System.out.println(hm.getKey()+" "+hm.getValue());
			
		}
		
		
		
	}

}
