class multiply
{
	int x,y;

  	void fun1()
	{
	 System.out.println(x+y);
	}

	void fun2()
	{
	 System.out.println(x*y);
	}


/* multiply()          // Constructor check in Simple Method.
{
  x=10; y=20;
 System.out.println("m Constructor="+x+" , "+y);

}  */


}

public class SimpleMethod
{

 public static void main(String args[])
  {
	
     multiply m=new multiply();
  // System.out.println("X:"+x+"Y:"+y);
     m.x=500;
     m.y=1000;
     m.fun1();
     m.fun2();

  }

}