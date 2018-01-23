
/**
 * Description: This is a subclass of LightSaberWeilder.
 * 
 * @author (Talmadge Glenn) 
 * @version (10/10/2015)
 */
public class FallenJedi extends LightSaberWeilder{
    private String darkJediMaster;
    private String apprentice;
    private String saberType;
    
    /**
      * Description: creates FallenJedi subclass
      * @precondition: none
      * @postcondition: none
      * @param: String darkJediMaster, String apprentice, string saberType
      * @return: none.
      */
     public FallenJedi(){
        setDarkJediMaster("Darth Sidious");
        setApprentice("Darth Maul");
        setSaberType("Darth Sidious: Single blade saber & Darth Maul: Double-bladed saber.");
   
    }
    
    /**
      * Description: sets the Dark jedi Master for FallenJedi subclass
      * @precondition: none.The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String darkJediMaster.
      * @return: none.
      */
     public final void setDarkJediMaster(String darkJediMaster){
        this.darkJediMaster = darkJediMaster;
    }
    
    /**
      * Description: sets the Apprentice for FallenJedi subclass
      * @precondition: none. The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String apprentice.
      * @return: none.
      */
     public final void setApprentice(String apprentice){
        this.apprentice = apprentice;
    }
    
    /**
      * Description: sets the Saber type for FallenJedi subclass
      * @precondition: none. The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String saberType.
      * @return: none.
      */
     public void setSaberType(String saberType){
        this.saberType = saberType;
    }
    
    /**
      * Description: returns the Dark jedi Master for FallenJedi subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String darkJediMaster.
      * @return: returns the Dark jedi Master for FallenJedi subclass.
      */
     public String getDarkJediMaster(){
        return darkJediMaster;
    }
    
    /**
      * Description: returns the apprentice for FallenJedi subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String apprentice.
      * @return: returns the apprentice for FallenJedi subclass.
      */
     public String getApprentice(){
        return apprentice;
    }
    
    /**
      * Description: returns the Saber Type for FallenJedi subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String saberType.
      * @return: returns the Saber Type for FallenJedi subclass.
      */
     public String getSaberType(){
        return saberType;
    }
    /**
      * Description: returns a list of FallenJedi with dark jedi master, apprentice, and saber type.
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String darkJediMaster, String alliance, String saberType
      * @return: returns a list of FallenJedi with darkJediMaster, apprentice, and saberType.      */
     public String toString(){
        return "\nDark Jedi Master: " + darkJediMaster +
        "\nApprentice: " + apprentice + "\nSaber Type: " + 
        saberType + ".";
    }
}
