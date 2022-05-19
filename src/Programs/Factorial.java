package Programs;

public class Factorial {
	
	
	
	public static void main(String[] args) {
	/*	
		//factorial of 5
		int a = 5;
		int res = 1;
		while (a>0) {
			res = res*a;
			a--;
		}
		System.out.println("Factorial of 5 is : "+res);   */
		
		//factorial of numbers from 5 in ascending order
		
		System.out.println("Ascending Order factorial");
       for (int i = 1; i<=5; i++) {
    	   int fact = 1;
    	   for (int j = 1; j <=i; j++) {
    	   fact = fact*j;	
    	   }
    	   
    	   System.out.println(fact);
	}
       
       System.out.println("=====================");
     //factorial of numbers from 5 in descending order
       System.out.println("Descending Order factorial");
           for (int i = 5; i>=1; i--) {
        	   int fact = 1;
        	   for (int j = 1; j <=i; j++) {
        	   fact = fact*j;	
        	   }
        	  
        	   System.out.println(fact);
    	}
		
	}
}
