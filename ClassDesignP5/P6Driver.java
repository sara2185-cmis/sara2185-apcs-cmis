
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
        int value = 0; 
        int value1 = 0; 
        int value2 = 0; 
        int value3 = 0;  
        int value4 = 0;  
        int value5 = 0;  
        int valueDealer = 0;  
        int totalScore = 0; 

        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(int i = 0; i < 2; i++)
        {
            player1[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);

            if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(player1[i].rank == "K" || player1[i].rank == "Q" || player1[i].rank == "J")
            {
                value = 10;
            }//end if
            if(player1[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            value1 += value;
            System.out.println( "Player 1: " + player1[i]);
            System.out.println("The value of my hand is " + value1);
        }// end for

        for(int i = 0; i < 2; i++)
        {
            player2[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
            if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(player2[i].rank == "K" || player2[i].rank == "Q" || player2[i].rank == "J")
            {
                value = 10;
            }//end if
            if(player2[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            value2 += value;
            System.out.println( "Player 2: " + player2[i]);
        }// end for
        System.out.println("The value of my hand is " + value2);

        for(int i = 0; i < 2; i++)
        {
            player3[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
             if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(player3[i].rank == "K" || player3[i].rank == "Q" || player3[i].rank == "J")
            {
                value = 10;
            }//end if
            if(player3[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            value3 += value;
            System.out.println( "Player 3: " + player3[i]);
        }// end for
        System.out.println("The value of my hand is " + value3);

        for(int i = 0; i < 2; i++)
        {
            player4[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
             if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(player4[i].rank == "K" || player4[i].rank == "Q" || player4[i].rank == "J")
            {
                value = 10;
            }//end if
            if(player4[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            value4 += value;
            System.out.println( "Player 4: " + player4[i]);
        }// end for
        System.out.println("The value of my hand is " + value4);

        for(int i = 0; i < 2; i++)
        {
            player5[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
             if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(player5[i].rank == "K" || player5[i].rank == "Q" || player5[i].rank == "J")
            {
                value = 10;
            }//end if
            if(player5[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            value5 += value;
            System.out.println("Player 5: " + player5[i]);
        }// end for
        System.out.println("The value of my hand is " + value5);

        for(int i = 0; i < 2; i++)
        {
            dealer[i] = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
             if(player1[i].rank == "2")
            {
                value = 2;
            }// end if
             if(player1[i].rank == "3")
            {
                value = 3;
            }// end if
             if(player1[i].rank == "4")
            {
                value = 4;
            }// end if
             if(player1[i].rank == "5")
            {
                value = 5;
            }// end if
             if(player1[i].rank == "6")
            {
                value = 6;
            }// end if
             if(player1[i].rank == "7")
            {
                value = 7;
            }// end if 
            if(player1[i].rank == "8")
            {
                value = 8;
            }// end if
             if(player1[i].rank == "9")
            {
                value = 9;
            }// end if
            if(dealer[i].rank == "K" || dealer[i].rank == "Q" || dealer[i].rank == "J")
            {
                value = 10;
            }//end if
            if(dealer[i].rank == "A")
            {
                value = 11;
            }//end if
            if(value > 21)
            {
                value = value - 10;
            }// end if
            valueDealer += value;
            System.out.println( "Dealer: " + dealer[i]);
        }// end for
        System.out.println("The value of my hand is " + valueDealer);

        /*
        Create 6 Arrays of 2 RANDOM cards each; one of these arrays will represent the dealer, the other 5 will represent players. check
        The rules of blackjack are as follows:
        cards with rank 2-10  are worth their face values check
        Jack, King and Queen (face cards) are worth 10 check
        Aces are worth 11 or 1 check
        Each player gets 2 cards. The dealer gets 2 cards check
        The total score of each player and the dealer is calculated check
        If a player’s score is greater than the dealer’s, the player wins
        If a player’s score is less than or equal to the dealer’s, the dealer wins
        If a player gets blackjack (a score of 21, i.e. a 10 or a face card and an ace) they win, even if the dealer also gets blackjack.
        Calculate the scores for all players and the dealer.
        Determine which players beat the dealer and which players were beaten.
        Display each hand and a summary of the results of the game.
         */

    }//end method main
}// end class CardDriver

