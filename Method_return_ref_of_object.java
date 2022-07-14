class Test
{
	int a;
	
	 Test (int x)
	{
		a=x;
	}
	
	Test incByTen()
	{
		Test temp=new Test(a+10);
		
		return temp;

	}
}


public class  Method_return_ref_of_object

{
	public static void main(String args[])
	{
		Test obj1=new Test(8);
		Test obj2;
			
		 obj2=obj1.incByTen();

		System.out.println("OBJ1.A=" + obj1.a + "\s OBJ2.A=" + obj2.a);		
	}
}