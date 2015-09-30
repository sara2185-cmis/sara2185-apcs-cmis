
public class Song
{
    //1. Create instance variables
    private String artist;
    private String name;
    private int length; // in minutes

    //2. Write constructor to initialize instance variables
    public Song()
    {
        artist = "Michael Jackson";
        name = "Beat it";
        length = 3;
    } // end constructor Song
    public Song(String artist, String name, int length)
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