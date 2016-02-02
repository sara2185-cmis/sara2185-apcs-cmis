
public class MySong
{
    //1. Create instance variables
    public String name;
    public int rating; 

    //2. Write constructor to initialize instance variables
    public MySong()
    {
        name = "Beat it";
        rating = 3;
    } // end constructor Song
    public MySong(String name, int rating)
    {
       this.name = name;
       this.rating = rating;
    } // end constructor Song
    //3. toString()
    public String toString()
    {
        String output = new String();
        output =
        "The name of the song is: " + name +
        " and its rating is: " + rating;
        return output;
    }

} // end Song