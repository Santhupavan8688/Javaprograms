import java.util.Date;

public class Employee45 {
private int eid;
private String ename;
private double salary;
private Date dob;
private Date doj; 

public Employee45() {
}


public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getEname() {
	return ename;
}

public void setEname(String ename) {
	this.ename = ename;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public Date getDoj() {
	return doj;
}

public void setDoj(Date doj) {
	this.doj = doj;
}

public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", dob=" + dob + ", doj=" + doj + "]";
}

}

