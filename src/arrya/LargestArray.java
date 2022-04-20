package arrya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LargestArray {
	public static int getlargest(Integer a[],int total) {
		List<Integer>al= Arrays.asList(a);
		Collections.sort(al);
		int array=al.get(total-1);
		return array;
		
	/*List<Integer> list=	Arrays.asList(a);
	Collections.sort(list);
	int element =	list.get(total-1);
	return element;*/
	}
	
//		int temp ;
//		for(int i=0;i<total;i++) {
//			for(int j=i+1;j<total;j++) {
//				if(a[i]>a[j]) {
//					temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//		}
//		return a[total-1];
	

	public static void main(String[] args) {
		Integer[] al= {45,24,55,784,45};
		System.out.println("get largest:"+getlargest(al,5));
	

}
}