package allJavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c;
		
		for(int i=1;i<=10;i++) {
			c=a+b;
			System.out.println("11111a is  " + a);

			System.out.println("c is "+c);
			a=b;
			System.out.println("a is  " + a);
			b=c;
			System.out.println("b is" + b);
		}
	}

}
