
/**
 * 
 *Test the   CalculatorTester class.
 * 
 * @author Darius Little,Talmadge Glenn,Caleb Klobe 
 * @version 9/28/2015
 */
import java.util.Scanner;
public class ShapeTester
{
    
    /**
     * Description: constructor for objects of class Measurable
     * 
     * @Return returns the perimeter and area for the Parellelogram
     * @Returns returns the perimeter, radius, and the area for the Circle.
     */
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Geometry Help!:"+
        "Please give me the side length of the Parallelogram in whole numbers");
        int p; 
        p = scan.nextInt();
        
        
        System.out.println("Geometry Help!:"+
        "Please give me  the height of the Parallelogram in whole numbers");
        int h; 
        h = scan.nextInt();
        Parellelogram c = new Parellelogram();
        System.out.println(c.perimeter(p));
        System.out.println(c.area(h));
         
         
         
        
        System.out.println("Geometry Help!:"+
        "Please give me  the circumference of the circle in whole numbers");
        int w; 
        w = scan.nextInt();
        System.out.println("Geometry Help!:"+
        "Please give me  the radius  of the circle in whole numbers");
        int y; 
        y = scan.nextInt();
        System.out.println("Geometry Help!:"+
        "Please give me a different  radius  of the circle in whole numbers");
        int z; 
        z = scan.nextInt();
        Circle x = new Circle();
        System.out.println(x.perimeter(w));
        System.out.println(x.circleRadius(y));
        System.out.println(x.area(z));
           
       
    }

    
}
