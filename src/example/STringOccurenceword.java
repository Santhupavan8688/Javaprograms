package example;

import java.util.HashMap;

public class STringOccurenceword {

	public static void main(String[] args) {
		String str= "java is the word. java is light";
		String[]st = str.trim().split("\\s");
		HashMap <String,Integer> hm = new HashMap<>();
		for(String s:st) {
			if(hm.containsKey(s)) {
				hm.put(s, hm.get(s)+1);
			}
			else {
				hm.put(s, 1);
			}
		}
		System.out.print("the occurernce is"+hm);
		

	}
}
