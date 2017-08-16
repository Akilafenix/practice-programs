package pack1;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) 
	{
		
		      char ch;
		      Scanner s1 = new Scanner(System.in);
				
		      System.out.print("Enter an Alphabet : ");
		      ch = s1.next().charAt(0);
				
		      if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
		      ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
		      ch=='u' || ch=='U')
		        {
		            System.out.print("This is a Vowel");
		        }
		        else
		        {
		            System.out.print("This is not a Vowel");
		        }
		      s1.close();
	}
}
		    
		

	


