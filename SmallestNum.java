import java.util.*;

class SmallestNum{
	public static void main (String args[]){
		Scanner scan = new Scanner (System.in);
		
		System.out.print("Please enter the three numbers ");
		
		int a = scan.nextInt();// 4
		int b = scan.nextInt();// 2 
		int c = scan.nextInt();// 9
		
		if(a<b)
		{
			if(a<c)
			{
				System.out.println(a+" is smallest");
			}
		}
		else
		{
			if(b<c)
			
				System.out.println(b+" is smallest");
		else
		{
			System.out.println(c+" is smallest");
		}
			
		}
	}

}