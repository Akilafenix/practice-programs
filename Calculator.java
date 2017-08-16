package pack1;
import java.util.*;

public class Calculator 
{

	public static void main(String[] args) 
	{
		int a,b,c;
		int choice;
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication;");
		System.out.println("4.division");
		Scanner s1=new Scanner(System.in);
		System.out.println("enter your choice");
		choice=s1.nextInt();
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication;");
		System.out.println("4.division");
		switch (choice)
		{
		case 1:
			System.out.println("enter the first value");
			a=s1.nextInt();
			System.out.println("enter the second value");
			b=s1.nextInt();
			c=a+b;
			System.out.println("Addition is"+" "+c);
			break;
		case 2:
			System.out.println("enter the first value");
			a=s1.nextInt();
			System.out.println("enter the second value");
			b=s1.nextInt();
			c=a-b;
			System.out.println("Subtraction  is"+" "+c);
			break;
		case 3:
			System.out.println("enter the first value");
			a=s1.nextInt();
			System.out.println("enter the second value");
			b=s1.nextInt();
			c=a*b;
			System.out.println("multiplication is"+" "+c);
			break;
		case 4:
			System.out.println("enter the first value");
			a=s1.nextInt();
			System.out.println("enter the second value");
			b=s1.nextInt();
			c=a/b;
			System.out.println("Division is"+" "+c);
			break;
			
			
		}
		s1.close();

	}

}
