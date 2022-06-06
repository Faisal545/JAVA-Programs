class add
{
	int x,y;

	int add() 
	{ 
	  int c=x+y;
// System.out.println(c);  // agr ye line execute ho to 3 bar output de rha hai wrna sirf1 bar.
	  return c;            // or return x+y;	
	          	

	}
}

public class MethodReturnValue
{
  public static void main(String args[])
   	{
	 add a=new add();
          a.x=1000;
	  a.y=500;
	  a.add();
	System.out.println(a.add());          	

	}
}