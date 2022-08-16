interface MyInf2 extends MyInf
{
	public double compute(double n);

}
interface MyInf
{
	public double sum (double a , double b)
	public void show();
}

class MyClass implements MyInf2
{
	double ans;
	
	public double sum(double a , double b)
	{
		ans=a+b;
		return a+b;
	}

	public void show()
	{
		System.out.println(" Answer of Sum Method "+ ans);
	}
	
	public double compute(double num)
	{
		
		return num*num;
	}
	
	
}

class MainDemoInfInheritance
{
	public static void main(String args[])
	{
		MyClass o1=new MyClass();
		
		double ans1=o1.sum(10,20);
		
			o1.show();
		
		
	}
		
}