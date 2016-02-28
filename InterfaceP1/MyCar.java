
/**
 *Sara
 * @February 26th, 2016
 */
public class MyCar extends Vehicle 
{
    private int mpg;
    private double lucky;
    public MyCar(int milesPerGallon)
    {
        this.mpg = milesPerGallon;
    }

    public MyCar(int passengers, int milesPerGallon)
    {
        super(passengers);
        this.mpg = milesPerGallon;
    }
    
    public void connectToBluetooth()
    {
       System.out.println("Connecting to bluetooth for a MyCar");
    }
    
    public String discountable()
    {
        lucky = Math.random();
        if( lucky > 0.5)
        {
            return "Today's your lucky day, your car is discountable!";
        }
        else{
            return "Sorry, your car is full price";
        }
        
    }
    public String toString()
    {
        return super.toString() + "\n" +
        "Milers per gallon for this car is: " + mpg;
    }
}
