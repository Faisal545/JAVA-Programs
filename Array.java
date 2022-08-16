	
import java.util.Scanner;

	public class Array
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
		
		//  Loop for Input
		for(i=0;i<size;i++)					// i< size or i< arr.length Both are correct.
		{
			arr[i]=scan.nextInt();
		}

		//System.out.println("");
			// or
		System.out.println("\n Output of Array:");

		// Loop for Output
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
	}

}
