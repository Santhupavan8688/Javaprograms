class mobilebrand1{
	public void price() {
		System.out.println("price of a phone");
		
	}
}
class mi extends mobilebrand1{
	public void price(){
		System.out.println("cost of a mi is:14521");
		
	}
}
class lenove extends mobilebrand1{
	
	public void price() {
		
		super.price();
	}
	
	
}
public class Override{
	public static void main(String[]args) {
		mobilebrand1 m = new mi();
		mobilebrand1 m1 = new lenove();
		m.price();
		m1.price();
	}
}