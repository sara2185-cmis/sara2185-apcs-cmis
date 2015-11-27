public class Running
{
    //1. Create instance variables
    private double miles; 
    private double kilometers;
    private double speed;// in miles/hr

    //2. Write constructor to initialize instance variables
    public Running()
    {
        miles = 5;

    } // end constructor Student
     public void setRunning(double miles)
    {
        this.miles = miles;
    }
    public void kilometers(double miles)
    {
        kilometers = miles*0.621371;
    } // end constructor Student
    public String encouragement()
    {
        String words = "";
        if(miles < 4)
        {
            words = "I can do better than this!";
        }
        else if(miles > 4 && miles < 10)
        {
          words = "I'm doing great!";
        }
        else if (miles >= 10)
        {
            words = "Super!";
        }
        return words;
    }
    public double speed(double time)
    {
        this.speed = miles/time;
        return speed;
    }

    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "I ran " + miles + " miles or " + kilometers + " kilometers. " + encouragement() + " I ran at " + speed;
        return output;
    }

} // end Student
