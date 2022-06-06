class multiply
{
	int x,y;

 //  System.out.println("X:"+x+"Y:"+y);
	void fun1()
	{
	 System.out.println(x+y);

	}

	void fun2()
	{
	 System.out.println(x*y);

	}

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