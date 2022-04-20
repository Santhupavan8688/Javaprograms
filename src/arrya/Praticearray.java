package arrya;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Praticearray {
	private static void smallestandlargest() {
		int [] array = new int[] {20,50,45,35,44,25};
		int largest =array[0];
		int smallest =array[0];
		for(int i=0;i<array.length;i++) {
			if(largest<=array[i]) {
				largest = array[i];
			}
			
		
		else if(smallest >=array[i]) {
			smallest = array[i];
				
			
			}	
		}
		System.out.println("largest array : "+largest);
		System.out.println("smallest array: "+smallest);
	}
	
	private static void duplicatesinarray() {
		List arr = new ArrayList ();
		arr.add(20);
		arr.add(20);
		arr.add(50);
		arr.add(50);
		arr.add(30);
		arr.add(30);
		System.out.println("array length:"+arr.size());
		int a=Collections.frequency(arr, 20);
		int b=Collections.frequency(arr, 50);
		int c =Collections.frequency(arr, 30);
		System.out.println(" number of times duplicates occur:"+a+" "+b+" "+c);
		
		
	}
	private static void deletearray() {
		int[]array = new int[] {20,50,30,44,22};
		int delete=30;
		for(int i=0; i<array.length;i++) {
			if(delete==array[i]) {
				for(int j=i;j<array.length-1;j++) {
					array[j]=array[j+1];
				}
				break;
				
			}
		}
		for(int i=0;i<array.length-1;i++) {
			System.out.println(array[i]+" ");
		}
		
	}
	public static void main(String[] args) {
		smallestandlargest();
		duplicatesinarray();
		deletearray();
	
				
	}



}
