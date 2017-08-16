package pack1;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
	
		        int num, i, count=0;
		        Scanner s1 = new Scanner(System.in);
		        System.out.print("Enter a Number : ");
		        num = s1.nextInt();
		        for(i=2; i<num; i++)
		        {
		            if(num%i == 0)
		            {
		                count++;
		                break;
		            }
		        }
		        if(count == 0)
		        {
		            System.out.print("This is a Prime Number");
		        }
		        else
		        {
		            System.out.print("This is not a Prime Number");
		        }
		        s1.close();
	}
}
		        
	


		    
		
	


