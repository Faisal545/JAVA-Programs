class add
{
	int a,b;
	
	int add(int x,int y)
	{
	  a=x;
  	  b=y;
	  return a+b;
	}
}


public class Method_Receiving_and_Returning_Value
{
  public static void main(String args[])
   	{
	   add a=new add();
 	int c= a.add(60,40);

	System.out.println(c);
	
  	}
}