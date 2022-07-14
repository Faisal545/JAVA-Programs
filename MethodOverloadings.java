class Addition
{
  int x,y,z;

/* Addition()      this is constructor.
{
  x=80;
  y=90;
  z=100;
System.out.println("x="+x+" y="+y+" z="+z);
}  */                       

void add(int a, int b)
{
 x=a;
 y=b;	
 System.out.println("x+y="+(x+y));
}

void add(int a, int b,int c)
{
 x=a;
 y=b;	
 z=c; 
System.out.println("x+y+z="+(x+y+z));
}

void add()
{
System.out.println("x+y+z="+(x+y+z));
}


}


public class MethodOverloadings      //LAB7BA
{
public static void main(String args[])
{
  Addition p =new Addition();
p.add();
p.add(2,5);
p.add(10,20);
p.add(10,20,30);



}

}