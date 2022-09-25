import java.util.*;

class Digits{
	public static void main (String args[]){
		
		System.out.println("Please enter the number ");
		Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		int i = 0;
		
		if(a<10)
			System.out.println("The digit is : "+a);
		else
			{
				if(a>=10)
				{
				if(a<=99)
				{
					System.out.println("The digits are: ");
					System.out.print((a/10)+ " and "+(a%10));
				}	
				if(a>=100)
				{
				if(a<=999)
					{	
					System.out.println("The digits are: ");
					System.out.print((a/100)+","+((a%100)/10));
					System.out.println(" and "+((a%100)%10));
					}
				if(a>=1000)
				 {
				if(a<=9999)
					{
					System.out.println("The digits are: ");
					System.out.print((a/1000)+","+((a%1000)/100));
					System.out.print(","+(((a%1000)/100)%100));
					System.out.println(" and "+(((a%1000)%100)%10));
					}
				 }			
				}		
			    }
			}
}
}