
/**
 *  Creates a set of required methods to get the value for the Circle.
 * 
 * @author Darius Little,Talmadge Glen,Caleb Klobe 
 * @version 9/28/2015
 * 
 */

import java.util.Scanner;
import java.lang.Math;
public class Circle implements Measurable

{
   
      /**
      * Description: Takes circumference to calculate the radius for a circle
      * 
      * @return Returns the radius of the circle.
      */
     public double perimeter (double p){
       Scanner scan = new Scanner(System.in);  
       System.out.println("Please give me  the circumference of the circle in whole numbers");
       p = scan.nextInt();
       double radiusCir;
       radiusCir = p/(2 * Math.PI);
       System.out.println(" Circle radius = "); 
       return radiusCir ;
       
     } 
     /**
      * Description: Takes radius to calculate the perimeter of a circle.
      
      * @return Returns the perimeter of the circle.
      */
     public double circleRadius (double radius2){
       Scanner scan = new Scanner(System.in);  
       System.out.println("Please give me  the radius  of the circle in whole numbers");
       radius2 = scan.nextInt();
       double perimeterCir;
       perimeterCir = 2 * (Math.PI * radius2);
       System.out.println(" Circle Perimeter =") ; 
       return perimeterCir;
     }
     /**
      * Description: Takes the radius to calculate the area for a Circle.
      * 
      * @return Returns the area of the circle.
      */
     public double area (double a){
      Scanner scan = new Scanner(System.in);  
      System.out.println("Please give me  another radius  of the circle in whole numbers");   
      a = scan.nextInt();
      double areaCir;
      areaCir = Math.PI * Math.pow(a,2);   
      System.out.println(" Circle Area =");  
      return  areaCir;
     }
}

