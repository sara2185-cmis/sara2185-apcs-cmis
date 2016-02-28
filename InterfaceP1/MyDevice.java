
/**
 * 
 * @Sara
 * @February 28th, 2016
 */
public abstract class MyDevice implements Connectable
{
    private int memory;
    private String color;
    
    public MyDevice()
    {
        this.memory = 8;
        this.color = new String("Black");
    }
 
    public MyDevice(int memory, String color)
    {
        this.memory = memory;
        this.color = color;

    }
   
    public String toString()
    {
        String output = new String("");
        output = "Memory: " + memory + 
        "\nColor: " + color;
        return output;
    }
}
