 class organisation{
	int eid;
	String name;
	double salary;
	public void organisation() {
		this.eid=eid;
		this.name=name;
			}
	
}
class employee1 extends organisation{
	public void employee1() {
		super.eid=eid;
		super.name=name;
		super.salary=salary;
		System.out.println(+eid+" "+name+" "+salary);
	}
}
public class Inheritance {

	public static void main(String[] args) {
		employee1 emp = new employee1();
		emp.eid=4521;
		emp.name="ramu";
		emp.salary=4514.4d;
		emp.employee1();
		emp.organisation();
			
	
	}

}
