interface printable 
 { 
         public void print(); 
 } 
 class A6 implements printable 
 { 
         public void print() 
         { 
                 System.out.print("Hello"); 
         } 
 } 
 public class Interface 
 { 
         public static void main(String arg[]) 
         { 
                 A6 p= new A6(); 
                 p.print(); 
         } 
 }