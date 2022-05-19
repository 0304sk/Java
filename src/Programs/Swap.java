package Programs;

public class Swap {
	public static void main(String[] args) {
		
	/*
	int a = 50;
	int b = 20;
	System.out.println("Before swapping" );
	System.out.println("A = "+a+ "\n"+ "B = "+b);
	
	//int temp = a;
	 a = a+b; //a=30
	 b = a-b; //b=10
	 a = a-b; //a=20
	 System.out.println("After swapping");
	 System.out.println("A = "+a+ "\n"+ "B = "+b);
	
	 System.out.println("using git here");   */
		
		String s="nisha";
		String s1="nisha";
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		String s2= new String ("nisha");
		String s3= new String ("nisha");
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
}
}