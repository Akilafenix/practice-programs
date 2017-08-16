package pack1;

public class Fibbonacci 
{

	public static void main(String[] args) 
	{
		int i,n1=1,n2=0;
		for(i=0;i<=12;i++)
		{
			n2=n1+n2;
			n1=n2-n1;
			System.out.println(n1);
		}
	}

}
