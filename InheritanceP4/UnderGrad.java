
/**
 * 
 * @Sara
 * @February 13th, 2016
 */
public class UnderGrad extends Student
{
    private String firstName;
    private String major;
    private int units;

    public UnderGrad(String firstName, String major, int units)
    {
        super(firstName, major, units);
    }

    public int calculateTuition(int units)  
    {
        return units * 250; // in dollars
    }
    
     public String toString()
    {
        return super.toString();
    }

}

