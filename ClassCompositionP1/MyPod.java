
/**
 * Write a class definition for a MyPod object that stores information about your personal music player. Class MyPod should include the following: 
an instance variable for its color
an instance variable for its memory capacity (in GB)
an instance variable of type array that can hold 3 Song objects called “songLibrary” that represents all songs in the MyPod
a zero-argument and multi-argument constructor to initialize all instance variables
a toString() method to display the object’s instance variables in a user friendly format. 

 * 
 * @Sara
 * @January 17th, 2016
 */
public class MyPod
{
    private String color;
    private int memoryCapacity;
    private String[] songLibrary = new String[3];

    
    public MyPod()
    {
        color = "Blue";
        memoryCapacity = 4; //in GB
        songLibrary[0] = "Dirty Paws";
        songLibrary[1] = "The Scientist";
        songLibrary[2] = "Happy";
        
        
    }

    public MyPod(String color, int memoryCapacity, String[] songLibrary)
    {
        this.color = color;
        this.memoryCapacity = memoryCapacity;
        this.songLibrary = songLibrary;
    }
    
     public String toString()
    {
        String output = new String();
        output = "The color is " + color + ", the memory capacity is " + memoryCapacity + ", and the songs are ";
        for(String song : songLibrary)
        {
            output += song + ", ";
        }
        return output;
    }
}
