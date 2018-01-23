
/**
 * Defines a LightSaberWeilder class.
 * 
 * @author (Talmadge Glenn) 
 * @version (10/07/2015)
 */
public class LightSaberWeilder
{
    private String name;
    private String lightSaberColor;
    private String era;
    
     /**
      * Description: create LightSaberWeilder class
      * @precondition: none
      * @postcondition: none
      * @param: String name, String lightSaberColor, string era
      * @return: none.
      */
     public LightSaberWeilder(){
        setName("Awdrysta Pina");
        setLightSaberColor("green");
        setEra("Old Republic");
    }
    
     /**
      * Description: sets parameters to LightSaberWeilder class.
      * @precondition: none
      * @postcondition: must be a String
      * @param: String name, String lightSaberColor, string era
      * @return: none.
      */
     public LightSaberWeilder(String name, String lightSaberColor, String era){
        setName(name);
        setLightSaberColor(lightSaberColor);
        setEra(era);
    }
    
     /**
      * Description: sets the name of LightSaberWeilder.
      * @precondition: none
      * @postcondition: must be a String
      * @param: String name
      * @return: none.
      */
     public void setName(String name){
        this.name = name;
    }
    
     /**
      * Description: sets the light saber color of LightSaberWeilder.
      * @precondition: none
      * @postcondition: must be a String
      * @param: String lightSaberColor
      * @return: none.
      */
     public void setLightSaberColor(String lightSaberColor){
        this.lightSaberColor = lightSaberColor;
    }
    
     /**
      * Description: sets the era of LightSaberWeilder and asserts that Era is not equal to Clone Wars..
      * @precondition: cannot equal to "Clone wars"
      * @postcondition: must be a String
      * @param: String era
      * @return: none.
      */
     public void setEra(String era){
        assert !era.equals("Clone Wars");
        this.era = era;
    }
    
     /**
      * Description: returns the name of LightSaberWeilder.
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: none
      * @return: Returns the name of LightSaberWeilder.
      */
     public String getName(){
        return name;
    }
    
     /**
      * Description: returns the light saber color of LightSaberWeilder.
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String lightSaberColor
      * @return: Returns the light saber color of LightSaberWeilder.
      */
     public String getLightSaberColor(){
        return lightSaberColor;
    }
    
    /**
      * Description: returns the era of LightSaberWeilder.
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String era
      * @return: returns the era of LightSaberWeilder.
      */
     public String getEra(){
        return era;
    }
    
    /**
      * Description: returns a list of light saber weilders with names, light saber colors, and era .
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String name, String lightSaberColor, string era
      * @return: returns the name, lightSaberColor, and era of LightSaberWeilder.
      */
     public String toString(){
        String s = "Name: " + getName() + "\nLightSaber Color: " + getLightSaberColor() + "\nEra: "+ getEra();
        return s;
    }
}
