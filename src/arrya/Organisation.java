package arrya;

 class Org {
	int eid;
	String Sname;
	double salary;
	public Org() {
		System.out.println("salary"+Sname+salary);
}
}
	class employee extends Org{
		public employee(){
			super.eid=45124;
			super.salary=145213.45d;
			System.out.println("employee="+eid);
			
		}
		
	}
	public class Organisation {
		public static void main(String[]args) {
			employee emp = new employee();
			

			
		}
	}
	
	