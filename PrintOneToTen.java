import java.util.*;

class PrintOneToTen{
	public static void main (String args[]){
		
		System.out.println("Please enter the number ");
		Scanner scan = new Scanner (System.in);
		long a = scan.nextLong();
		if(0<a<9)
			Sysytem.out.println("The digit is "+a);
		else
		{
			if(10 < a < 99)
			System.out.println("The digits are: ");
			System.out.print((a/10)+ " and "+(a%10));
		}
			
		
	}
}