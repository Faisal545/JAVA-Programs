class String_args
{

	public static void main(String args[])
	{ 						
		System.out.println("Array size:"+args.length);
		
		int index;
		for(int i=0;i<args.length;i++)
		{
			index=i;
			System.out.println("\n Data stored on index number "+ index+"="+args[i]);
			
		}		
	}

}