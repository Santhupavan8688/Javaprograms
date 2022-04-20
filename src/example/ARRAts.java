package example;

import java.util.HashSet;
import java.util.Set;

public class ARRAts {

	public static void main(String[] args) {
	String []str = {"raju","kana","raju","ramu","kana"};
	String []str1 = removeduplicate(str);
	System.out.println("orginal elements:::: ");
	for(String element :str) {
		System.out.println(element);
	}
	System.out.println(" removing elemts :::");
	for(String element : str1) {
		System.out.println(element);
	}
	/*String []str = {"raju","kana","raju","ramu","kana"};
	//find duplicate elements in arrays
	/*for(int i=0;i<str.length;i++) {
		for(int j=i+1;j<str.length;j++) {
			if(str[i]==str[j]) {
				System.out.println("Duplicate elemnts :"+str[j]);
			}
		}
		
	}*/
	//using set to find the duplicate elemnts 
	/*Set<String>sh =new HashSet<>();
	for(String s:str) {
		if(!sh.add(s)) {
			System.out.println("duplicate number : "+s);
		}
	}*/
	

	}

	private static String[] removeduplicate(String[] str) {
		Set<String> s = new HashSet<>();
		for(String element:str) {
			s.add(element);
		}
		String[]str1 =s.toArray(new String[s.size()]);
		return str1;
	}

	
}
