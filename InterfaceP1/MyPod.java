
/**
 * 
 * @Sara
 * @February 28th, 2016
 */
public class MyPod extends MyDevice
{

    public MyPod()
    {
        super();

    }

    public MyPod(int memory, String color)
    {
        super(memory, color);

    }

     public void connectToBluetooth()
    {
       System.out.println("Connecting to bluetooth for a MyPod");
    }
    
    public String toString()
    {
        String output = new String("");
        output = super.toString() ;

        return output;
    }
}
