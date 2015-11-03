import javax.swing.JOptionPane;
public class ClassMethodP1
{
    //1. Create instance variables
    private String artist;
    private String name;
    private int length; // in minutes
    private int yearReleased;
    private String user = JOptionPane.showInputDialog( "What is your username?");
    private String pass = JOptionPane.showInputDialog( "What is your password?");
    private int password = Integer.parseInt(pass);

    //2. Write constructor to initialize instance variables
    public ClassMethodP1()
    {
        artist = "Michael Jackson";
        name = "Beat it";
        length = 3;
    } // end constructor Song
    public int getYearReleased()
    {
        return yearReleased;
    }//end method getYearReleased
    public void setYearReleased(int year)
    {
        if(( password == 1234) && user.equals("Sara"))
        {
            System.out.println (" You have successfully logged in");
            this.yearReleased = year;

        }
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
        "Name is: " + name + "\n" +
        "Song length is: " + length;
        return output;
    }

} // end Song