package example;

import java.util.HashSet;

public class set {

	public static void main(String[] args) {
		HashSet<Employee1>h =new HashSet<Employee1>();
		h.add(new Employee1(101,"santhu"));
		h.add(new Employee1(101,"santhu"));
		h.add(new Employee1(101,"santhu"));
		h.add(new Employee1(101,"santhu"));
		h.add(new Employee1(101,"santhu"));
		for(Employee1 emp :h) {
			System.out.println("empid "+emp.getEid()+"empname "+emp.getEname()+"hashcode "+emp.hashCode());
			
		}
		
	}

}
