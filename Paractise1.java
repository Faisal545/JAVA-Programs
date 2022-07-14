/*
class practise
{
	
	int x=100; 
	int y=500;         // Method 1     Simple Method/ Parameter less Method.

void show()
{
 	
	System.out.println("X+Y="+(x+y));
}

}

public class Paractise1
{
	public static void main(String args[])
	{
		practise pr=new practise();
		pr.show();
		
//		System.out.println(pr.x+pr.y);

		
	}
}






  class practise
{
		int x,y;
	
				 // Method 2.  initialize with object of the class.

	void show()
{
 	
	System.out.println("X+Y="+(x+y));
}

}


  public class Paractise1
{
	public static void main(String args[])
	{
		practise pr=new practise();
		pr.x=100;
		pr.y=700;                        // Method 2.
		pr.show();
	
	 //   Upper pr.show()  or below output function both are correct.    
	
		System.out.println(pr.x+pr.y);

		
	}
}







class practise
{
			              //   Method 3. Initialize BY constructor 
	int x,y;	


   practise(int a, int b)
 {
	x=a;
	y=b;   	
System.out.println("X+Y="+(x+y));


 } 

}

public class Paractise1
{
	public static void main(String args[])
	{
		practise pr=new practise(400,300);
		
	}
}



*/




class practise                // By  Parameter less Constructor.
{
	int x,y;
	
practise()
{

	x=405;
	y=795;	

	System.out.println("X+Y="+(x+y));

}

}

public class Paractise1
{
	public static void main(String args[])
	{
		practise pr=new practise();
		
	//System.out.println("X+Y="+(x+y));
//		System.out.println(pr.x+pr.y);

		
	}
}

