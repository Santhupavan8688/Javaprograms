package arrya;


import java.util.Map;

import java.util.TreeMap;

public class Treemap {

	public static void main(String[] args) {
		TreeMap<Integer,String> tr=new TreeMap<Integer,String>();
		tr.put(104, "rajesh");
		tr.put(102, "ramu");
		tr.put(101, "kiran");
		tr.put(104, "rajesh");
		tr.put(103, "santhu");
		tr.put(105, "pratap");
		for(Map.Entry<Integer, String> ha:tr.entrySet()) {
			System.out.println(ha.getKey()+""+ha.getValue());
		}
	}

}
