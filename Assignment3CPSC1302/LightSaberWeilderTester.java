
/**
 * Tester for LightSaberWeilder superclass.
 * 
 * @author (Talmadge Glenn) 
 * @version (10/27/2015)
 */
public class LightSaberWeilderTester
{
    public static void main(String[] args){
        System.out.println("This program prints four jedi. First two Jedi Masters of Light, then two Fallen Jedi(Dark Side) Masters");
        System.out.println();
        
        System.out.println("Known as the Green Blade. She is one of the first Jedi Masters");
        LightSaberWeilder j1 = new LightSaberWeilder();
        System.out.println(j1.toString());
        System.out.println();
        
        System.out.println("The most popular Jedi Master of them all.");
        j1.setName("Yoda");
        j1.setLightSaberColor("green");
        j1.setEra("Great Jedi Purge");
        System.out.println(j1);
        System.out.println();
        
        System.out.println("Ancient dark jedi who was defeated by Awdrysta Pina");
        LightSaberWeilder j2 = new LightSaberWeilder("Xendor", "red", "Old Republic");
        System.out.println(j2);
        System.out.println();
        
        System.out.println("Arguable the most notorius Sith Lord/Dark Jedi of all time");
        LightSaberWeilder j3 = new LightSaberWeilder("Supreme Chancellor Palpatine(Darth Sidious)", "red", "Great Jedi Purge");
        System.out.println(j3);
        System.out.println();
        
        System.out.println("These are examples of Jedi of light. Those who aren't influenced by negative emotions.");
        JediOfLight j4 = new JediOfLight();
        System.out.println(j4);
        System.out.println();
        
        System.out.println("These are examples of Fallen Jedi better known as Dark Jedi. Those who are influenced by negative emotions.");
        FallenJedi j5 = new FallenJedi();
        System.out.println(j5);
        System.out.println();
    }
}
        