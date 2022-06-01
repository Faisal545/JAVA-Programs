class Addition 
{
  int x,y;

int add()
  {
    return x+y; 
  }

}


  public class Lab6_3
{
  public static void main(String args[])
  {

    Addition P=new Addition();
    P.x=10;
    P.y=20;
    P.add();
    System.out.println(P.add()); 

  }
   
}  