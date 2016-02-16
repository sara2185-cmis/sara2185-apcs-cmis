

/**
 * 
 * @Sara
 * @February 13th, 2016
 */
public class WaxMan extends SuperHero
{
    private String suitColor;
    private boolean hasCape;
    
    public WaxMan()
    {
        super();
    }
  

    public String motto()  
    {
        return "Don't play with candles!";
    }
    
     public String toString()
    {
        return "WaxMan\t" + super.toString();
    }

}
