
/**
 * Write a description of class ClockStore here.
 * 
 * @author (your name) 
 * @January 20th, 2016
 */
public class ClockStore
{
    Clock[] clocksInStock = new Clock[3];

    
    public ClockStore()
    {
        clocksInStock[0] = new Clock( 12, 25, 25);
        clocksInStock[1] = new Clock( 9, 10, 55);
        clocksInStock[2]= new Clock( 23, 45, 30);
    }
    public int mostSeconds()
    {
        int most = 0;
        for(int i = 0; i < clocksInStock.length; i++)
        {
            if(clocksInStock[i].totalSeconds() > most)
            {
                most = i;
            }
        }
        return most;
    }
    public String toString()
    {
        String output = new String();
        for(Clock clock: clocksInStock)
        {
            output += clock + "\n";
        }
        return output;
    }
}
