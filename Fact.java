package pack1;

import java.util.*;

 class Factorial
{
		int i,fact=1,num;
		void get()
		{
		Scanner s1=new Scanner(System.in) ;
		System.out.println("enter the number");
		num=s1.nextInt();
		s1.close();
		}
		void disp()
		{
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		}
		void print()
		{
		
		System.out.println("factorial is"+" "+fact);
		
		}
	}
	class Fact
	{
		public static void main(String[] args)
		{
			Factorial obj=new Factorial();
			obj.get();
			obj.disp();
			obj.print();
		
	}

}
