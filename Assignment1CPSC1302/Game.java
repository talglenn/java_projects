
/**
 * Two cars race .
 * 
 * @author Talmadge Glenn,Darius Little,Caleb Klobe
 * @version  version 1 9/6/2015
 */
public class Game
{
    private int distanceTraveled;
    private String car;
    //default constuctor
   
    public Game(){
        distanceTraveled = 0;
        car = "BMW I8";
    }
    // custom Constructor
    public Game(int newDistanceTraveled,String newCar){
        distanceTraveled = newDistanceTraveled;
        car = newCar;
    }   
    // public interface
    //Getters, Accessors
    public int getDistanceTraveled(){
        return distanceTraveled;
    }
    public String getCar(){
        return car;
    }
    //setters.mutators
    public void setDistanceTraveled(int newDistanceTraveled){
        distanceTraveled = newDistanceTraveled;
    }
     public void setCar(String newCar){
        car = newCar;
    }
    //return a textual
    public String toString(){
        return "Distance Traveled:" + distanceTraveled +
        "\nCar?:" + car;
    }
}
