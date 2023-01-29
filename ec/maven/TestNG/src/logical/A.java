package logical;

import java.io.File;

public class A {



	public static void HI() {
//		file="/home/kedar/Documents/ORM-Project (1).xlsx";
		System.out.println("hii");
	}
	
	
	public static String Hello(String a) {
		System.out.println("Hello");
		return a;
	}
	
	public static void SHOW () {
		System.out.println("the static show method");
	}
	
	
	public static void main (String[]args) {

//		A.HI();
		
		int a,b,c;
		a=101;
		b=10;
		
		c=a%b;
		
		System.out.println(c);
	}
	
}
