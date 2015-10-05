
public class Clock
{
    //1. Create instance variables
    private int hour;
    private int min;
    private int sec;
    //2. Write constructor to initialize instance variables
    public Clock()
    {
       hour = 15;
       min = 45;
       sec = 23;
    } // end constructor Clock
    public Clock(int hour, int min, int sec)
    {
       this.hour = hour;
       this.min = min;
       this.sec = sec;
    } // end constructor Song
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The time is " + String.format("%02d", hour) + ":" + String.format("%02d", min) + ":" + String.format("%02d", sec);
        return output;
    }

} // end Song