package Programs;

public class PascalCamal {
	public static void main(String[] args) {
	/*	
	//Pascal
	
	String s = "Welcome to java class";
	String[] split = s.split(" ");
	String ans = "";
	System.out.println("Before: " +s);
	
	for (String string : split) {
		char charAt = string.charAt(0);
		char upperCase = Character.toUpperCase(charAt);
		String substring = string.substring(1);
		ans = ans+upperCase+substring+" ";
	}
	 System.out.println("After: " +ans);
	 */
		//CAMAL
		//input: Welcome to java class
		//output: welcome To Java Class 
		String s = "Welcome to java class";
		String ans = "";
		
		
		/*
		 // in case, capitol and small letters are mixed in string, use the below code instead of finding w1
		  * input: WelCome to jAvA clasS
		  * output: welcome To Java Class
		  s1 = "";
		  for(int i = 0; i<s.length(); i++) {
		  	Char c = s.charAt(i);
		  	s1 = s1+Character.toLowerCase(c)
		  	}
		  	String[] split = s1.split(" ");
		   	
		 */
		String[] split = s.split(" ");
		String w1 = split[0];
		char w1c1 = w1.charAt(0);
		char lowerCase = Character.toLowerCase(w1c1);
		String substring = w1.substring(1);
		ans = lowerCase+substring+" ";
		
		for (int i = 1; i < split.length; i++) {
				String string = split[i];
				char charAt2 = string.charAt(0);
				char upperCase = Character.toUpperCase(charAt2);
				String substring2 = string.substring(1);
				ans = ans+ upperCase + substring2 +" ";
		}
		//ans= ans+ans2;
		System.out.println(ans);       
	
	}
}	
		
