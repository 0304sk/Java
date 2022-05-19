package Programs;

public class Palindrome {
	
	public static void main(String[] args) {
		
		//Reverse a digit and find if it is palindrome
		
		int a = 12321;
		int rev = 0;
		int temp = a;
		
		
		while(a>0) {
			
			int n = a%10;
			rev = (rev * 10)+n;
			a/=10;
		
		}	
		System.out.println(rev);
		
		if (rev == temp) {
			System.out.println("The given number is palindrome");
		}else {
			System.out.println("The given number is not a palindrome");
		}
	}

}
