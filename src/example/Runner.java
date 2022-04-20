package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		List <laptop> lap = new ArrayList<>();
		lap.add(new laptop("hp" , 16 , 800));
		lap.add(new laptop("dell", 8, 600));
		lap.add(new laptop("acer", 12, 900));
		lap.add(new laptop("lenovo", 4, 200));
		lap.add(new laptop("asus", 6, 600));
		Comparator<laptop> com =new Comparator<laptop>() {

			@Override
			public int compare(laptop lap1, laptop lap2) {
				if(lap1.getPrice()>lap2.getPrice())
					return 1;
				else
				return -1;
			}
			
		};
		Collections.sort(lap, com);
		for(laptop l : lap)
		System.out.println(l);
		
		
	}

}
