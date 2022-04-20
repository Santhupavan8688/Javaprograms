
public class Multiconstructor {
	public int stid;
	public String sname;
	public String scourse;
	public float stavgmarks;
	public Multiconstructor () {
		stid = 10;
		sname = "roman";
		scourse="b.tech";
	}
	public Multiconstructor(int sid,String name,String course) {
		this.scourse=course;
		this.stid=sid;
		this.sname=name;
	}
	public Multiconstructor(int sid,String name, float stavgmarks) {
		this.stid=sid;
		this.stavgmarks=stavgmarks;
		this.sname=name;
	}
		
		public void display (){
			System.out.println(stid+" "+sname+" "+scourse);
			
		}
		public static void main(String []args) {
			Multiconstructor multi = new Multiconstructor();
			Multiconstructor multi1 = new Multiconstructor(10,"sai","java");
			Multiconstructor multi2 = new Multiconstructor(15,"raju","java");
			Multiconstructor multi3 = new Multiconstructor(20,"ram","java");
			multi.display();
			multi1.display();
			multi2.display();
		}
			
		}
	


