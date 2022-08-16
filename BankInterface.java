interface Bank 
 { 
         float rateofinterest(float x); 
 } 
 class SBI implements Bank 
 { 
          
         public float rateofinterest(float x) 
         { 
                 System.out.println("Interest Of SBI="+x); 
                 return x; 
         } 
 } 
 class PNB implements Bank 
 { 
          
         public float rateofinterest(float x) 
         { 
                 System.out.print("Interest Of PNB="+x); 
                 return x; 
         } 
 } 
  
 public class BankInterface 
 { 
         public static void main(String arg[]) 
         { 
                 SBI s=new SBI(); 
                 PNB p=new PNB(); 
                 s.rateofinterest(9.15f); 
                 p.rateofinterest(9.7f); 
         } 
 }