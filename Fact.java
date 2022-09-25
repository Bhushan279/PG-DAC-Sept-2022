import java.util.*;

class Factorial{
	
	public static void main (String args[]){
		
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("Please enter the number to find the factorial= ");
	 int a = scan.nextInt();
	 int b = 1;
	  for (int i=1;i<=a;i++)
	  {
		  //int b=1;
		  b= b*i;
		 //int c = a*b;
		// System.out.println(" The fact is  "+c);
	  }
		//int c = a*
		System.out.println(" The fact is  "+b);
	
		
	}	
}