package Programs;

import java.util.Iterator;

public class Arrays {
	
	// Ascending Order
	/*
	public static void main(String[] args) {
		int[] a = new int [5];
		a[0] = 5;
		a[1] = 8;
		a[2] = 3;
		a[3] = 1;
		a[4] = 2;
		
		for (int i = 0; i < a.length; i++) {  // 
			for (int j = i+1; j < a.length; j++) {  // 
				
				if (a[i] > a[j]) {              //5>8 ; 5>3 ; 
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;	
				}
			}
			
		}
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println();        */
	
	public static void main(String[] args) {
		int[] a = new int [5];
		a[0] = 5;
		a[1] = 8;
		a[2] = 3;
		a[3] = 1;
		a[4] = 2;
		
		for (int i = 0; i < a.length; i++) {  // 
			for (int j = i+1; j < a.length; j++) {  // 
				
				if (a[i] < a[j]) {              //5>8 ; 5>3 ; 
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;	
				}
			}
			
		}
		for (int i : a) {
			System.out.println(i);
		}
		
		
		
	}

}
