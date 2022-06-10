class Addition
{
   int x,y;

Addition()   //  Simple Constructor without parameters
{
 x=150;
 y=381;

//System.out.println("Sum of X & Y="+(x+y));

} 


Addition(int a , int b)    //  Parameterized Constructor
{
 x=a;
 y=b;

//System.out.println("Sum of X & Y="+(x+y));

}


}

public class Simple_Paramertrized_OverloadingConstructor
{ 
  public static void main(String args[])
  {
    Addition p= new Addition();
    Addition q= new Addition(5000,25000);
    Addition r= new Addition(7000,9000);
 
System.out.println(p.x);
System.out.println(p.y);
System.out.println("Sum of X & Y="+(p.x+p.y));

System.out.println(q.x);
System.out.println(q.y);
System.out.println("Sum of X & Y="+(q.x+q.y));

System.out.println(r.x);
System.out.println(r.y);
System.out.println("Sum of X & Y="+(r.x+r.y));

  }
}
 

