
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
        int value, totalScore;
        String values;

        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for(int i = 0; i < 13; i++)
        {
            System.out.print(i+":");
            values = "";
            if(rank[i] == "2" || rank[i] == "3" ||rank[i] == "4" ||rank[i] == "5" ||rank[i] == "6" ||rank[i] == "7" ||rank[i] == "8" ||rank[i] == "9" ||rank[i] == "10" )
            {
                value = i + 1;
            }// end if
            if(rank[i] == "K" || rank[i] == "Q" || rank[i] == "J")
            {
                value = 10;
            }//end if
            if(rank[i] == "A")
            {
                value = 11;
            }//end if
        }// end for
        /*
        if(Integer.parseInt(values) > 21)
        {
            value = Integer.parseInt(values)-10;
        }// end if
        */
       //totalScore += value;
       
        for(int i = 0; i < 2; i++)
        {
            player1[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( "Player 1: " + player1[i]);

            player2[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( "Player 2: " + player2[i]);

            player3[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( "Player 3: " + player3[i]);

            player4[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( "Player 4: " + player4[i]);

            player5[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println("Player 5: " + player5[i]);

            dealer[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            System.out.println( "Dealer: " + dealer[i]);
        }//end for loop

    }//end method main
}// end class CardDriver

