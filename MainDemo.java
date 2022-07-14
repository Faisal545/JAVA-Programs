class X
{
	Y objy = new Y();
	X()
	{
		System.out.println("x");
	}
}
class Y
{
	Y()
	{
		System.out.println("y");
	}
}
class Z extends X
{
	Z()
	{
		System.out.println("z");
	}
}

public class MainDemo
{
	public static void main(String args[])
	{
		new Z();
	}
}