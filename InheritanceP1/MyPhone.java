
/**
 * 
 * @Sara
 * @February 13th, 2016
 */
public class MyPhone extends MyDevice
{
    private String carrier;
    
    public MyPhone()
    {
        super();
        this.carrier = new String("TOT");
    }
 
    public MyPhone(int memory, String color, String carrier)
    {
        super(memory, color);
        this.carrier = carrier;
    }
   
    public String toString()
    {
        String output = new String("");
        output = super.toString() + 
        "\nCarrier: " + carrier;
        return output;
    }
}
