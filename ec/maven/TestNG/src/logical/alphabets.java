package logical;

public class alphabets {
	
	public void findOnlyAlphabetsFromString () {
//		Find only alphabets from Given String.
//		String str = "Harsh&@789al";
		String str = "Harsh&7al";

		String N = "";

		for(int i=0;i<str.length();i++) {
			N=""+str.charAt(i);
			N = N.replaceAll("[^a-zA-Z0-9]", " ");  
			N=N.replaceAll("7","");
			System.out.println(">>>>" + N);


//			if(N=="@"||N=="7"||N=="8"||N=="9"||N=="&") {
//				if(N=="&") {
//					
//					System.out.println(N.replace("&",""));
//				}
//					else if(N=="7") {
//						System.out.println(N.replace("7",""));
//					}else {
//						System.out.println(">>>>" + N);
//					}

				}
		
				
		}

	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		alphabets a = new alphabets();
		a.findOnlyAlphabetsFromString();
		
	}

}

