
public class CardDriver
{
    public static void main( String[] args )
    {
        Card myHand[] = new Card[3];
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for(int i = 0; i < 3; i++)
        {
            myHand[i] = suit[(int)(4* Math.random())] + rank[(int)(13* Math.random())];

        }//end for loop

    }//end method main
}// end class CardDriver

