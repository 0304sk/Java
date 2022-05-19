package Programs;

import java.util.Iterator;

public class OddOrEven {
	
	//find odd or even from 1 to 100
	
	public static void main(String[] args) {
		
		int oddcount=0;
		int evencount=0;
		int oddsum=0;
		int evensum=0;
		
		System.out.println("Even numbers between 1 to 100 are");
		
		for (int i = 1; i <=100; i++) {
			
			if (i%2==0) {
				System.out.println(i);
				evencount++;
				evensum+=i;
			}
		}	
		System.out.println("Total number of even numbers between 1 to 100 is: "+evencount);
		System.out.println("Sum of even numbers between 1 to 100 is: "+evensum);
		System.out.println("======================================================");
		System.out.println("The odd numbers between 1 to 100 are");
		
		for (int j = 1; j <=100; j++) {
				if (j%2!=0) {
					
					System.out.println(j);
					oddcount++;
					oddsum+=j;
				}
			}
		System.out.println("Total number of odd numbers between 1 to 100 is: "+oddcount);
		System.out.println("Sum of odd numbers between 1 to 100 is: "+oddsum);
		}
		
	}

