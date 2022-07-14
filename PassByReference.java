class PBRef
{
	int x,y;
	void swap(PBRef o)
	{
		int temp;
		temp=o.x;
		o.x=o.y;
		o.y=temp;
	}
}


public class  PassByReference
{
	public static void main(String args[])
	{
		PBRef obj=new PBRef();
		obj.x=10;
		obj.y=20;
		System.out.println("Before calling X=" + obj.x + "\s Y=" + obj.y);
		obj.swap(obj);
		System.out.println("After calling  X=" + obj.x + "\s Y=" + obj.y);		
	}
}