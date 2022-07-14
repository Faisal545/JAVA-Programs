class Passbyreference_practise
{
	int x,y;
	
	void swap(Passbyreference-practise z)
	{
		int temp;
		temp=z.x;
		z.x=z.y;
		z.y=temp;

	}	
}


public class Pbref_practise
{
	public static void main(String args[])
	{
		Passbyreference-practise pbr=new Passbyreference-practise();
		
		pbr.x=863;
		pbr.y=22442;

		System.out.println("Before calling X:" + pbr.x + "\s Y=" + pbr.y);
		pbr.swap(pbr);
		
		System.out.println("Before calling X:" + pbr.x + "\s Y=" + pbr.y);
			 	
	}	

}