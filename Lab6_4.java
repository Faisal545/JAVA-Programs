class Addition 
{
  int x,y;

int add(int a, int b)
  {
     x=a;
     y=b; 
     
     return x+y; 
  }

}


  public class Lab6_4
{
  public static void main(String args[])
  {

    Addition P=new Addition();
   int c= P.add(10,20);
    System.out.println(c); 

  }
   
}  