package example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Floattodecimal {

	public static void main(String[] args) {
	  Scanner sc= new Scanner(System.in);
	  System.out.println("enter the value of f1 :");
	  float f1 =sc.nextFloat();
	  System.out.println("enter the value of f2 :");
	  float f2 = sc.nextFloat();
	  
	  DecimalFormat df =new DecimalFormat("##.###");
	  String st = df.format(f1);
	  String st1 = df.format(f2);
	  
	if(st==st1) {
		System.out.println(f1+""+f2+" are same");}
		else{
			System.out.println("not same");
			}
		}
	}


