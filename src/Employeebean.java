import java.util.Date;

public abstract class Employeebean {

	public static void main(String[] args) {
		Employee45 emp1 = new  Employee45();
		emp1.setEid(100);emp1.setEname("sunny");
		emp1.setDob(new Date());emp1.setSalary(2245d);
		emp1.setDoj(new Date());
		emp1.getDob();emp1.getDoj();emp1.getSalary();
		System.out.println(""+emp1.toString());
	}

}