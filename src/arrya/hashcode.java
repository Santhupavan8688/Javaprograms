package arrya;

import java.util.HashSet;

public class hashcode {

	public static void main(String[] args) {
		Organisation1 employee = new Organisation1(1,"santhu",6354);
		Organisation1 employee1 = new Organisation1(1,"santhu",6354);
        
		HashSet<Organisation1> emp = new HashSet<Organisation1>();
		emp.add(employee);
		emp.add(employee1);
		System.out.println(" hash set size = "+emp.size());
		System.out.println(" hashset contains duplicate :"+emp.contains(new Organisation1(1,"santhu",6354)));
	}

}
