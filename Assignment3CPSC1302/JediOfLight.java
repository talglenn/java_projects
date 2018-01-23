
/**
 * Description: This is a subclass of LightSaberWeilder.
 * 
 * @author (Talmadge Glenn) 
 * @version (10/10/2015)
 */
public class JediOfLight extends LightSaberWeilder{
    private String jediMaster;
    private String padawan;
    private String alliance;
    
    /**
      * Description: creates JediOfLight subclass
      * @precondition: none
      * @postcondition: none
      * @param: String jediMaster, String padawan, string alliance
      * @return: none.
      */
     public JediOfLight(){
        setJediMaster("Qui-Gon Jinn");
        setPadawan("Obi-Wan Kenobi");
        setAlliance("Republic");
   
    }
    
    /**
      * Description: sets the jediMaster for JediOfLight subclass
      * @precondition: none.The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String jediMaster
      * @return: none.
      */
     public final void setJediMaster(String jediMaster){
        this.jediMaster = jediMaster;
    }
    
    /**
      * Description: sets the padawan for JediOfLight subclass
      * @precondition: none. The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String padawan
      * @return: none.
      */
     public final void setPadawan(String padawan){
        this.padawan = padawan;
    }
    
    /**
      * Description: sets the alliance for JediOfLight subclass
      * @precondition: none.The method does not perform opertations that may crash(like null pointers of divide by 0)
      * @postcondition: must be a String
      * @param: String alliance
      * @return: none.
      */
     public final void setAlliance(String alliance){
        this.alliance = alliance;
    }
    
    /**
      * Description: sets the era for JediOfLight subclass
      * @precondition: must be in super class.
      * @postcondition: must be a String
      * @param: String padawan
      * @return: none.
      */
     public void setEra(String era){
        super.setEra("Clone Wars");
    }
    
    /**
      * Description: returns the jedi master for JediOfLight subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String jediMaster
      * @return: Returns the jedi master for JediOfLight subclass.
      */
     public String getJediMaster(){
        return jediMaster;
    }
    
    /**
      * Description: returns the padawan for JediOfLight subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String padawan
      * @return: Returns the padawan for JediOfLight subclass.
      */
     public String getPadawan(){
        return padawan;
    }
    
    /**
      * Description: returns the alliance for JediOfLight subclass
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String alliance
      * @return: Returns the alliance for JediOfLight subclass.
      */
     public String getAlliance(){
        return alliance;
    }
    
    /**
      * Description: returns a list of JediOfLight with jedi master, padawan, and alliance.
      * @precondition: must be a String
      * @postcondition: must be a String
      * @param: String jediMaster, String padawan, string alliance
      * @return: returns the jediMaster, padawan, and alliance of JediOfLight. In addition to an overriden era method.
      */
     public String toString(){
        return  "\nJedi Master: " + jediMaster +
        "\nPadawan: " + padawan + "\nAlliance: " + 
        alliance + ".";
    }
}
