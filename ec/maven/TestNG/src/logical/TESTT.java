package logical;

public class TESTT {

    public static String removeAllDigit(String str){
        // Converting the given string
        // into a character array
        char[] charArray = str.toCharArray();
        String result = "";
        
        System.out.println("result" + charArray[0]+charArray[1]);
 
        // Traverse the character array
        for (int i = 0; i < charArray.length; i++) {
//        	if(String.
            // Check if the specified character is not digit
            // then add this character into result variable
            if (!Character.isDigit(charArray[i])) {
                result = result + charArray[i];
            }
        }
 
        // Return result
        return result;
    }
    
    
    public  static String removeAllSpecialCharacters(String Str) {
    
//    	 Str=Str.replaceAll("[^a-zA-Z0-9]", "");
    	 System.out.println("the given string is " + Str);
    	 Str=Str.replaceAll("[^a-zA-Z0-9 ]", "");
    	 System.out.println("all special characters are removed " + Str);

    	 Str=Str.replaceAll("[^A-Za-z]", "");
    	 System.out.println("all numeric values are being removed " + Str);

    	 
    	 return Str;
    	 
    }
    
    
	public static void main(String[] args) {
		
		String str = "G1";
		 
        // Print the modified string
//        System.out.println("removed all digit "+removeAllDigit(str));
        
        System.out.println(" removed numeric and special characters  "+removeAllSpecialCharacters("Harsh&@789al"));

	}

}
