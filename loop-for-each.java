
import java.util.Scanner;
class loop-for-each
{
{
	public static void main(String args[])
	{
		
		int a1,b;
		a1=2;	b=50;
		System.out.println(a1);
		System.out.println(b);
		
		Scanner sc=new Scanner(System.in);		
		int a[]=new int[5];

		System.out.println("Taking User Input");
		for(int i=0; i<5; i++)
		{
			a[i]=sc.nextInt();
		}	
	
		System.out.println("Output using For-each Loop");
		for(int abc: a)
		{		
			System.out.println(abc);		
		}
	}


}