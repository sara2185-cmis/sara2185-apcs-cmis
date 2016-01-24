
/**
 * @Sara
 * @January 24th, 2016
 */
public class Banana
{
    private String type;
    public int daysOld;
    private int length;// in centimeters

    public Banana()
    {
        type = "namWa";
        daysOld = 4;
        length = 5; 
    }
    public Banana(String type, int daysOld, int length)
    {
        this.daysOld = daysOld;
        this.type = type;
        this.length = length;
    }

    public String toString()
    {
        String output = new String();
        output = "The type of banana is " + type + ", the length is " + length + ", and it is " + daysOld + " days old. ";
        return output;
    }
}
