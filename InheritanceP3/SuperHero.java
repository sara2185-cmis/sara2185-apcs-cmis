
/**
 * 
 * @Sara
 * @February 13th, 2016
 */
public abstract class SuperHero
{
    private String suitColor;
    private boolean hasCape;


    public SuperHero()
    {
        this.suitColor = new String();
        this.hasCape = false;

    } // end zero-arg constructor SuperHero
   
    public void setSuitColor(String suitColor)
    {
        this.suitColor = new String( suitColor );
    } // end method setSuitColor

    public String getSuitColor()
    {
        return suitColor;	
    } // end method getSuitColor

    public void setCape(boolean cape)
    {
        this.hasCape = cape;	
    } // end method setCape

    public boolean isCaped()
    {
        return hasCape;	
    } // end method isCaped

    public abstract String motto();   

    public String toString()
    {
        String output = new String("");
        output =  hasCape + "\t" + getSuitColor() + "\t" + motto();
        return output;
    }

} // end abstract class SuperHero
