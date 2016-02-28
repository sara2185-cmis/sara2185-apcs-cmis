
/**
 * 
 * @Sara
 * @February 28th, 2016
 */
public abstract class TV
{

    private boolean tvOn;
    
    public TV()
    {
        tvOn = false;
    }

    public boolean getTvOn()
    {
        return tvOn;
    }

    public void setTvOn(boolean tvOn)
    {
        this.tvOn = tvOn;
    }

    public abstract String tvType();
}
