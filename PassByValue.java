class PBValue
{
	void swap( int x , int y)
	{
		int temp;
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("After calling: A=" +  x + "\s B=" + y);

	}
}

	public class  PassByValue
{
		public static void main(String args[])
	{
		PBValue obj=new PBValue();
		int a,b;
		a=50;  b=100;
		System.out.println("Before calling: A=" + a + "\s B=" + b);
		obj.swap(a,b);
		//System.out.println("After calling A=" +  a + "\s B=" + b);		
	}
}