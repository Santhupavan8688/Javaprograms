class Animals{
	void food() {
		System.out.println("eating a food");
	}
}
class lion extends Animals{
	void food() {
		System.out.println("lions barks");
	}
}
class goat extends Animals{

	
	void food() {
		System.out.println("goats love");		
		
	}
	
}




public class Animalslad {

	public static void main(String[] args) {
		Animals lion = new lion();
		lion.food();
		Animals goat = new goat();
		goat.food();

	}

}
