public class Newclass{
	public double room=10.99d;
	public double memebers=15.45d;
	public double totalstudents;
	public double students(String names,int eid,double roomrent) {
		if(roomrent<=100) {
			System.out.println("have large number");
		}
			else {
				System.out.println("no members");
			}
		return roomrent;
	
	}
}
class science extends Newclass{
	
	public double students(String names, int eid, double roomrent) {
		// TODO Auto-generated method stub
		return super.students(names, eid, roomrent);
	}
}