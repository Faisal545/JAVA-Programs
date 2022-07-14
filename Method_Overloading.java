class Addition
{
 int x,y,z;

void add(int a , int b)
{
 x=a; y=b;
System.out.println("X:"+x+" Y:"+y); 
}

void add(int a , int b , int c)
{
 x=a; y=b; z=c;
System.out.println("X:"+x+" Y:"+y+" Z:"+z); 
}

}

public class Method_Overloading
{
  public static void main(String args[])
  {
     Addition a=new Addition();
	a.add(3247,25);
	a.add(426,92);
	
	a.add(426,92,654);
	a.add(1,3,5);
  }

}