package allJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int t1=number;
		int length = 0;
		while(t1!=0) {
			t1 = t1/10;
			length = length+1;  // for find out number of digits
			
		}
		System.out.println("The Length of the number is " + length);
		int t2 = number;
		int arm = 0;
		int rem ;
		while(t2!=0) {
			int mul =1;
			rem = t2%10;
			for(int i=1;i<=length;i++) {
				mul = mul*rem;
				System.out.println(mul+"mull");
			}
			arm = arm+mul;//1+125+27 153 is Armstrong number
//The Armstrong number is a number whose cube of numbers and then add each cube number returns the 
//	Same number is called ArmStrong number		
			System.out.println(arm + "arms");
			t2 = t2/10;
		}
		if(arm==number) {
			System.out.println(number +"is Armstrong number");
		}
		else {
			System.out.println(number +" is not Armstrong number");
		}	
		
	}

}