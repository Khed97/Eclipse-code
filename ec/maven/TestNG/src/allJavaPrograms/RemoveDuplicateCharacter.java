package allJavaPrograms;

import java.util.Scanner;

public class RemoveDuplicateCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String w = sc.next();
		 
		String nw = " ";
		
		System.out.println("Original String: "+w);
		
		for(int i=0;i<w.length();i++) {
			char ch = w.charAt(i);
			System.out.println("New alphabet "+ch);

			if(ch!=' ') {
			nw = nw + ch;
			w = w.replace(ch, ' ');
			System.out.println("new word "+w);

			}
		}
		System.out.println("New word = "+nw);

	}

}
