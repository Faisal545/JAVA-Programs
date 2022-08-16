interface MyInf
{
	public 	double sum(double a, double b);
	public	void show();
}

interface MyInf2 extends MyInf
{
	public double compute(double num);
	
}

class MyClass implements MyInf2
{
	double ans;
	
	public double sum(double a , double b)
	{
		double x,y;
		x=a; 
		y=b;
		ans=(x+y);

		return a+b;
	}

	public void show()
	{
		System.out.println("Answer of Sum Method="+ans);
	}

	public double compute(double num)
	{
		return num*num;	
	}

}


class Hassaan_interface
{

	public static void main(String args[])
	{
		MyClass cls=new MyClass();
		
		double ans1=cls.sum(10.0,20.0);
		double ans2=cls.compute(6.0);

		System.out.println("Output of Sum="+ans1);
		cls.show();
		 System.out.println("Output of Compute="+ ans2);

	}
}


















