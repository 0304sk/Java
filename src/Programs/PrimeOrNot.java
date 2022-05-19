package Programs;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		
		int a = 17;
		int x = 0;
		
		for (int i = 2; i < a/2; i++) {
			if (a%i  == 0) {
				x++;
			}
		}
			if(x==0) {
				System.out.println("the number is Prime");			
		}else {
			System.out.println("The number is not a Prime");
		}
	
}
}

