interface Drawable 
 { 
         void draw(); 
 } 
 class Rectangle implements Drawable 
 { 
         public void draw() 
         { 
                 System.out.println("Drawing Rectangle"); 
         } 
 } 
 class Circle implements Drawable 
 { 
         public void draw() 
         { 
                 System.out.print("Drawing Circle"); 
         } 
 } 
 public class TestInterface1 
 { 
         public static void main(String arg[]) 
         { 
                 Rectangle r=new Rectangle(); 
                 Circle c=new Circle(); 
                 r.draw(); 
                 c.draw(); 
                  
         } 
 }