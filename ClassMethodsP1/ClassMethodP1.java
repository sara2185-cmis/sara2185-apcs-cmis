import javax.swing.JOptionPane;
public class ClassMethodP1
{
    //1. Create instance variables
    private String artist, name;
    private int length; // in seconds
    private int yearReleased;
    String user = JOptionPane.showInputDialog( "What is your username?");
    String pass = JOptionPane.showInputDialog( "What is your password?");
    int password = Integer.parseInt(pass);
    private String minutes = "";
    private int seconds;

    //2. Write constructor to initialize instance variables
    public ClassMethodP1()
    {
        artist = "Michael Jackson";
        name = "Beat it";
        length = 343;
    } // end constructor Song
    public int getYearReleased()
    {
        return yearReleased;
    }//end method getYearReleased
    public void setYearReleased(int year)
    {
        if(( password == 1234) && user.equals("Sara"))
        {
            this.yearReleased = year;
        }
    }//end method getYearReleased
    public String convertToMinSec()
    {
        minutes = (Integer.toString(length/60)) + " minutes " + (Integer.toString(length%60)) + " seconds.";
        return minutes;
    }//end method getYearReleased
    public ClassMethodP1(String artist, String name, int length)
    {
        this.artist = artist;
        this.name = name;
        this.length = length;
    } // end constructor Song
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The artist of the song is: " + artist + "\n" +
        "Name is: " + name + "\n";
        return output;
    }
    /*
    Add a private instance variable yearReleased that stores the year the Song was released. check
    Upgrade the Song’s constructors to properly initialize the new instance variable yearReleased. check
    Add “getter” and “setter” methods for the private instance variable yearReleased. These methods will be called getYearReleased() and setYearReleased(). check
    Write a method convertToMinSec() that converts the length of the song in seconds to minutes and second(s). The output of the method should be a String. If the length of the song in seconds is 343, then the method should return the following String:
    The length of the song is: 5 minutes and 43 seconds.
    Write a new SongDriver class to test the Song’s new constructors and setYearReleased() and getYearReleased() and methods.
    Integrate your password program into the setYearRelased() method so that that “yearReleased” instance variable can only be set if the correct username and password are input. check

     */

} // end Song