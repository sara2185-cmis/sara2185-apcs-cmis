
/**
 * Abstract class Vehicle - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Vehicle implements Connectable, Discountable
{
    private int numPassengers;
    public Vehicle()
    {
        this.numPassengers = 0;

    }

    public Vehicle(int passengers)
    {
        this.numPassengers = passengers;
    }

    public abstract void connectToBluetooth();
    
    public abstract String discountable();

    public String toString()
    {
        return "Number of passengers is: " + numPassengers;
    }
}
