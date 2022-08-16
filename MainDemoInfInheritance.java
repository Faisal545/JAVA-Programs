
interface MyInf
{
	 double sum(double a , double b);
	 void show();
}

interface MyInf2 extends MyInf
{
	 double compute(double num);

}

class MyClass implements MyInf2
{
	double ans;
	
	public double sum(double a , double b);
	{
		/*double x,y;
		x=a;
		y=b;
		ans=(x+y);
		*/

		return 0; 
	}

	public void show();
	{
		 System.out.println(" Answer of Sum Method "+ ans);
	}
	
	public double compute(double num);
	{
		
		return num*num;
	}
		
}

class MainDemoInfInheritance
{
	public static void main(String args[])
	{
		MyClass o1=new MyClass();
		
		double ans1=o1.sum(10.0,20.0);
		double ans2=o1.compute(6.0);
		
		 // Output of Sum return value.
		System.out.println("Output of Sum ="+ans1);
		
		System.out.println("Output of Show= "+o1.show());
		System.out.println("Output of Compute Method ="+ ans2 );
		
		
		
		
	}
		
}