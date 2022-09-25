import java.util.*;

class CheckNumber{
	public static void main (String args[]){
		
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		
		if(a==0)
		 System.out.println("The numeber is ZERO ");
		else
		{
			if(a>0)
				System.out.println("The given number is Positive");
			else
			{
				System.out.println("The given number is Negative");
			}
		}
		
	}

}