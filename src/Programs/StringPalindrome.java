package Programs;

import java.util.Iterator;

public class StringPalindrome {
	public static void main(String[] args) {
		/*
		 //Reverse a string and check if palindrome
		String s = "Madam";
		String ans = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
		ans = ans+s.charAt(i);
		}
		System.out.println(ans);
		
		if (s.equalsIgnoreCase(ans)) {
			System.out.println("The string is a palindrome");
		}else {
			System.out.println("The String is not a palindrome");
		}
		
		
		//Reverse each word in a String
		
		String s = "Hello World! Welcome to Earth..";
		System.out.println(s);
		String[] split = s.split(" ");
		for (String string : split) {
			String ans = "";
			
			for (int i = string.length()-1; i >= 0; i--) {
				
				ans = ans+string.charAt(i);
				
			}
			 System.out.print(ans+ " ");
		}
		*/
		
		//input = demo  
		//output = deemmmooo
		
		String s= "demo";
		String op = "" ;
		
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			for (int j = 0; j <=i ; j++) {
				
				 op = op+c;
			}
			
		}
		System.out.println(op);
		System.out.println("=======================");
		
		//input = demo
		/* output = d
		            ee
		            mmm
		            oooo
		 */
		
		for (int i = 0; i < s.length(); i++) {
			
			//char c = s.charAt(i);
			
			for (int j = 0; j <=i ; j++) {
				
				 //op = op+c;
				char c = s.charAt(i);
				System.out.print(c);
			}
			System.out.println();
			
		}
			
	}
		

}
