	// import java.lang;
import java.util.Scanner;

	public class ArrayIndexSearch
{	
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
			
		int i,size;
		System.out.print("\nEnter the size of Array:");
		size=scan.nextInt(); 
	//	System.out.println("Enter the size of Array:"+ size);
		
		int arr[]=new int[size];
		
		System.out.println("Enter the Numbers in Array of size:"+size );
		
			// Input Loop
		for(i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//System.out.println("");
		
		System.out.println("\n Output of Array:");
		
			// Loop for Output
			
			for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		
		}
		
		System.out.println();
			
		System.out.print("Enter the number to find index:");
		int x=scan.nextInt();		
		
		 	// Loop for Index finding & printing.
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]== x)
			{
			System.out.println("Array is at Index number:"+ i);
			}
		}
		
	}

}
