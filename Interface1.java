interface i1
{
	public void fun1();

}
interface i2 extends i1
{
	public void fun2();
}

class Main implements i2
{
	public void fun1()
	{
		System.out.println(" I'm Function 1");
	}

	public void fun2()
	{
		System.out.println(" I'm Function 2");
	}
}

class Interface1
{
	public static void main(String args[])
	{
		Main m=new Main();
		m.fun1();
		m.fun2();
		
		
	}
		
}