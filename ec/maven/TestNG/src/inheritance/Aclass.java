package inheritance;

public class Aclass {

	public void show (int a,int b) {
		System.out.println("This is from Aclass	"+ (a+b));
	}
	
	public static void main(String[] args) {
		
		int abc [] [] = new int [2] [2];
		
		abc[0][0]=10;
		abc[0][1]=20;
		abc[1][0]=30;
		abc[1][1]=40;
		
		String country [] [] = {{"india","srilanka"},{"England","scotland"},{"Usa","Russia"}};
//		abc[2][0]=50;
//		abc[2][1]=60;
		
		System.out.println("ji"+country.length);
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
//			System.out.println("country areee"+country[i][j]);
			}
		}
		// TODO Auto-generated method stub
		
		Aclass A = new Aclass ();
//		A.show(5, 0);
		
//		String str1 = "SELENIUM";
//		String str3 = "SELENIUM";
//		String str2 = "Selenium";
//		System.out.println("lowercase "+str3.toLowerCase());
//		System.out.println("this is str3 " + str3);
//		String str4 = "ZSelenium";
//		System.out.println(str1.compareTo(str2));//negative
//		System.out.println(str2.compareTo(str1));//positive
//		System.out.println(str1.compareTo(str3));//0
//		
//		System.out.println(str1.compareTo(str4));
		
		String wish = "Good";
		String morningwish ="Good";
//		
//		
//		wish=wish.concat(morningwish);
		
		
		
//	String	wish="afternoon";

//		System.out.println("concatenated "+wish.charAt(0));
		
		StringBuilder sb=new StringBuilder("Hello ");
		sb.insert(1,"Java");//now original string is changed
		System.out.println(sb);//prints HJavaello
		sb.delete(1, 5);
//		System.out.println("reverse"+sb.reverse());//prints HJavaello
//		System.out.println("capacity "+ sb.capacity());
		
//		
//		int m = 100;
//		long h=100;
//		int j=(int) h;
//		System.out.println("::::"+j);
		
		
		String a="100";
		int num= Integer.parseInt(a);
		System.out.println(num);
		

	}

}
