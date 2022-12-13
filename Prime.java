
// P R I M E      N U M B E R 


/*
	
import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int count=0;
		for (int i=1;i<=n;i++ )
		{
			if(n%i==0)
			{
			 count++;
			}  
		}
		if(count==2)
		{
		System.out.println(n+" is a prime number");
		}
		else
		{
		 System.out.println(n+" is not a prime number");
		}
	}

}

*/


//2

/*
class Prime 
{
	public static void main(String[] args) 
	{
		for(int j=1;j<=50;j++)
		{
			int n=j;
		int count=0;
		for (int i=1;i<=n;i++ )
		{
			if(n%i==0)
			{
			 count++;
			}
		}
		if(count==2)
		{
		System.out.println(n+" is a prime number");
		}
		else
		{
		 System.out.println(n+" is not a prime number");
		}
		}
	}

}

*/

class Prime 
{
	public static void main(String[] args) 
	{
		int n=7 ;
		int count=0;
		for (int i=1;i<=n;i++ )
		{
			if(n%i==0)
			{
			 count++;
			}  
		}
		if(count==2)
		{
		System.out.println(n+" is a prime number");
		}
		else
		{
		 System.out.println(n+" is not a prime number");
		}
	}

}
