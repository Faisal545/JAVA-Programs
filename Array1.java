import java.util.Scanner;
public class Array1
{
  public static void main(String args[]) 
  {
  
  Scanner scan=new Scanner(System.in);
  int size,i; 
  System.out.print("Enter size of an array:");
  size= scan.nextInt();

  int a[]=new int[size];
  
    

 System.out.println("Enter the Elements of an Array:\t");
    for(i=0;i<size;i++)
    {
    
      a[i]=scan.nextInt();
 
    }

System.out.println(" Output ");

    for(i=0;i<size;i++)
    {
      System.out.println(a[i]);

      }
      System.out.println();


    for(i=0;i<a.length;i++)
{    
     if(a[i]==3)
      {
         int index=0;
         // index=a[i];
index=i;           
 //System.out.println("" + i);
System.out.println(index);
              

      }

}

  }

}