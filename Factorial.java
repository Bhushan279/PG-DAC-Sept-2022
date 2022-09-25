import java.util.*;

class Factorial{
	
	public static void main (String args[]){
		
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("Please enter the number to find the factorial= ");
	 int a = scan.nextInt();
	 int b = 1;
	 
	  for (int i=1;i<=a;i++)
		  
	  {
		  b= b*i;
	  }
		
		System.out.println(" The fact is  "+b);
	
		
	}	
}