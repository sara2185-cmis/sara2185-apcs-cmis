
public class Card
{
    //1. Create instance variables
    private String suit;
    private String rank;

    public static void main ( String args[] )
    {
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Card myHand[] = new Card[3];
        for(int i = 0; i < myHand.length; i++)
        {
            myHand[(int) ( 4* Math.random())] = suit[i];
            myHand[(int) ( 13* Math.random())] = rank[i];
            
        }//end for loop
        
    }// end main
/*
    //2. Write constructor to initialize instance variables
    public Card()
    {
        suit = 
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
*/
} // end Card