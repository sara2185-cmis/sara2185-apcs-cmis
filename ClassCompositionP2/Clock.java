
public class Clock
{
    //1. Create instance variables
    private int hour;
    private int min;
    private int sec;
    private int allSeconds;
    private int hours;
    //2. Write constructor to initialize instance variables
    
    public Clock()
    {
       hour = 11;
       min = 28;
       sec = 12;
    } // end constructor Clock
    public Clock(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min; 
        this.sec = sec;
    } // end constructor Clock
    public void setTime(int hour, int min, int sec)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
    }// ends method setTime
    public void convertDaylightSaving(int hour)
    {
        this.hour = this.hour + hour;
        // h = h + delta( 1/-1)
    }// ends method convertDaylightSaving
    public int totalSeconds()
    {
        allSeconds = (hour * 3600) + (min * 60) + sec;
        return allSeconds;
    }//ends method totalSeconds
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The time is " + hour + ":" + min + ":" + sec + "\n";
        return output;
    }

    
} // end Clock