
/**
 * 
 * @Sara
 * @January 19th, 2016
 */
import java.util.ArrayList;
public class MyPod2
{
    private String color;
    private int memoryCapacity;
    private ArrayList<String> songLibrary= new ArrayList<String>();

    public MyPod2()
    {
        color = "Blue";
        memoryCapacity = 4; //in GB
        songLibrary.add("Happy");
        songLibrary.add("The Scientist");
        songLibrary.add("Dirty Paws");

    }
    public MyPod2(String color, int memoryCapacity, ArrayList<String> songLibrary)
    {
        this.color = color;
        this.memoryCapacity = memoryCapacity;
        this.songLibrary = songLibrary;
    }

    public String toString()
    {
        String output = new String();
        output = "The color is " + color + ", the memory capacity is " + memoryCapacity + ", there are " + songLibrary.size() + " songs and the songs are ";
        for(String song : songLibrary)
        {
            output += song + ", ";
        }
        return output;
    }
}
