class animals1{
	void food() {
		System.out.println("eating a food");
	}
}
class lion1 extends animals1{
	void food() {
		System.out.println("lion barks");
	}
}
class goat1 extends animals1{
	void food() {
		System.out.println("goat finding a food");
	}
}
public class Class{
	public static void main(String[] args) {
		animals1 m = new lion1();
		m.food();
		animals1 g = new goat1();
		g.food();
	}
	
	
}