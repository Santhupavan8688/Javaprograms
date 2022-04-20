package arrya;

import java.util.Calendar;

public class Calendar45
{

	public static void main(String[] args) {
		Calendar sd = Calendar.getInstance();
		System.out.println("current date:"+sd.get(Calendar.DATE)+" "+sd.get(Calendar.YEAR)+" "+sd.get(Calendar.MONTH));
		sd.add(Calendar.DAY_OF_MONTH, 5);
		System.out.println("current date:"+sd.get(Calendar.DATE)+" "+sd.get(Calendar.YEAR)+" "+sd.get(Calendar.MONTH));
		  
		
		
	}

}
