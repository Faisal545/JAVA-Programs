class A
{
	void show()
	{
		System.out.println("Faisal Sajjad: Parent");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("Haseeb: Baby");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("TFK: Haseeb's Chachu");
	}
}


class MainDemoFaisal
{
	public static void main(String args[])
	{
		A aa=new A();
		B bb=new B();
		C cc=new C();
		
		aa.show();
		A ref;
		ref=bb;
		bb.show();
		cc.show();
	}
}
