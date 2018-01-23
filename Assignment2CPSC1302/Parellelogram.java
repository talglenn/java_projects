
/**
 * Creates a set of required methods to get the value for the parellelogram.
 * 
 * @author Darius Little,Talmadge Glen,Caleb Klobe 
 * @version 9/28/2015
 * 
 * 
 */
import java.util.Scanner;
import java.lang.Math;
public class Parellelogram implements Measurable

{
     /**
      * Description: Takes the side length to calculate the perimeter for a Parellelogram.
      * 
      * @return Returns the perimeter of the Parellelogram.
      */
     public double perimeter (double p){
       Scanner scan = new Scanner(System.in);
       System.out.println("Please give me  the side length of the Parallelogram in whole numbers");
       p = scan.nextInt();
       double perimeterPar;
       perimeterPar= 2 * (10 + p);
       System.out.println(" Parallelogram  Perimeter =") ; 
       return perimeterPar;
     }
     /**
      * Description: Takes the height to calculate the area for a Parallelogram
      * 
      * @return Returns the area of the Parellelogram.
      */
     public double area (double a){
      Scanner scan = new Scanner(System.in);   
      System.out.println("Please give me  the height  of the Parallelogram in whole numbers");
       a = scan.nextInt();
       double areaPar;
       areaPar= 10 * a;
       System.out.println(" Parallelogram area =") ;    
       return areaPar;
       }
     
}
