
public class Test2 {
	


	public void NestedIfExample () {
		System.out.println("hiii");
		int age=17;
		int weight=51;
		
		if(age>18) {
			System.out.println("your age is ok ");
			if(weight>50) {
				System.out.println("You are eligible for blood donation");
			}
		}
		
	}
	
	public void EnhancedForLoop () {
		String launguage [] = {"java","python","javascript","C++"};
		
		System.out.println(launguage.length);
		
//		for(String lan:launguage) {
//			System.out.println(lan);
//		}
		
		for (int i=0;i<launguage.length;i++) {
			System.out.println(launguage[i]);

		}
	}
	public Test2 () {
		System.out.println("constructor calling");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2  T1 = new Test2 ();
		
//		T1.NestedIfExample();
		T1.EnhancedForLoop();
		
		
//		int i=1;
//		
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		String name ="ajay";
	int number =name.length();
	
	System.out.println("the length is " + number);
		
	}

}
