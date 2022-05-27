import java.util.Scanner;
public class Input
{ 
 public static void main(String args[])
{
   int n1,n2,n3,n4,n5;
float Sum,Subtract,Multiply,Divide,avg;

  Scanner scan=new Scanner(System.in);
 System.out.print("Enter number 1=");
 n1=scan.nextInt();
System.out.print("Enter number 2=");
 n2=scan.nextInt();
System.out.print("Enter number 3=");
 n3=scan.nextInt();
System.out.print("Enter number 4=");
 n4=scan.nextInt();

System.out.print("Enter number 5=");
n5=scan.nextInt();

Sum=n1+n2+n3+n4+n5;
System.out.println("Sum="+Sum);

Subtract=n1-n2-n3-n4-n4;
System.out.println("Subtract="+Subtract);

Multiply=n1*n2*n3*n4*n5;
System.out.println("Multiply="+Multiply);

Divide=n1/n2/n3/n4/n5;
System.out.println("Divide="+Divide);

avg=Sum/5;
System.out.println("AVERAGE = "+avg);

if(avg>=80)
{
System.out.println("Excellent");

}

if(avg>=70&&avg<80)
{
System.out.println("Good");

}  

if(avg>=60&&avg<70)
{
System.out.println("Fairly Pass");

}  

if(avg>=50&&avg<60)
{
System.out.println("Pass");

}  
if(avg<50)
{
System.out.println("Fail");
}
}  






}