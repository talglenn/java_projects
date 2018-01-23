
/**
 * Define  GameTester .
 * 
 * @author Talmadge Glenn,Darius Little ,Caleb Klobe
 * @version 1st version 9/5/2015
 */

public class GameTester
{
   public static void main(String[] args){
    Game racer1 = new Game();
    Game racer2 = new Game(0,"Bugatti");
    
    System.out.println("Welcome to the race between the " + racer1.getCar() + " and " + racer2.getCar() + "!");
    System.out.println("The first car to 25 miles wins.");
    System.out.println("Ready...Set...Go!!!!");
    System.out.println();

    while((racer1.getDistanceTraveled() <=25) && (racer2.getDistanceTraveled() <=25)){
        System.out.println("The BMW i8 is at " + racer1.getDistanceTraveled() + " miles");
        System.out.println("The Bugatti is at " + racer2.getDistanceTraveled() + " miles");
        racer1.setDistanceTraveled(racer1.getDistanceTraveled() + 2);
        racer2.setDistanceTraveled(racer2.getDistanceTraveled() + 5);
    }
    System.out.println();
    System.out.println("The " + racer2.getCar() + " wins!!!");
    
    }
    
   
}
