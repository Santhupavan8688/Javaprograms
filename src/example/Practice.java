package example;

import java.util.LinkedHashSet;

class Remove{
	void removeduplicates(String str) {
		LinkedHashSet<Character>lh=new LinkedHashSet<>();
		for(int i=0;i<str.length();i++) 
			lh.add(str.charAt(i));
			for(Character ch :lh)
				System.out.print(ch);
			
		
	}
}


public class Practice {

	public static void main(String[] args) {
	
		String str="haihall";
		Remove re = new Remove();
		re.removeduplicates(str);
	}
}