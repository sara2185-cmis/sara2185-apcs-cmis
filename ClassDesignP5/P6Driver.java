
public class P6Driver
{
    public static void main( String[] args )
    {
        Card player1[] = new Card[2];
        Card player2[] = new Card[2];
        Card player3[] = new Card[2];
        Card player4[] = new Card[2];
        Card player5[] = new Card[2];
        Card dealer[] = new Card[2];
        int value, values;
        if(Card = "K" || Card = "Q" || Card = "J")
        {
            value = 10;
        }//end if
         if(Card = "A")
        {
            value = 11;
        }//end if
        values = 
        if(values > 21)
        {
            values-10;
        }// end if
        
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for(int i = 0; i < 3; i++)
        {
            myHand[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( myHand[i]);
        }//end for loop

    }//end method main
}// end class CardDriver

