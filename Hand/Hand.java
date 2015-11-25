public class Hand
{
    private int nCards;
    private int totalPoints = 0;
    private Card cardsInHand;
    private String name;
    private int playerPoints = player.getPoints();
    private int dealerPoints = dealer.getPoints(); 

    public Hand()
    {
        nCards = 2;
        for(int i = 0; i < nCards; i++)
        {
            cardsInHand = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
        }
    }

    public void thisHand(String name)
    {
        nCards = 2;
        for(int i = 0; i < nCards; i++)
        {
            cardsInHand = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
        }
        this.name = name;
    }

    public int getPoints()
    {
        for(int i = 0; i < nCards; i++)
        {
            if(cardsInHand.rank == "K" || cardsInHand.rank == "Q" || cardsInHand.rank == "J"|| cardsInHand.rank == "10")
            {
                value = 10;
            }//end if
            else if(cardsInHand.rank == "2")
            {
                value = 2;
            }// end if
            else if(cardsInHand.rank == "3")
            {
                value = 3;
            }// end if
            else if(cardsInHand.rank == "4")
            {
                value = 4;
            }// end if
            else if(cardsInHand.rank == "5")
            {
                value = 5;
            }// end if
            else if(cardsInHand.rank == "6")
            {
                value = 6;
            }// end if
            else if(cardsInHand.rank == "7")
            {
                value = 7;
            }// end if 
            else if(cardsInHand.rank == "8")
            {
                value = 8;
            }// end if
            else if(cardsInHand.rank == "9")
            {
                value = 9;
            }// end if
            else 
            {
                value = 11;
            }//end else 
            totalPoints += value;
            if(totalPoints > 21)
            {
                totalPoints= totalPoints - 10;
            }// end if
        }// end for

    }

    public int compare(Hand dealer)
    {
        if (playerPoints == 21)
        {
            System.out.println("Player got blackjack and wins!");
        }//end if
        else if (playerPoints > dealerPoints)
        {
            System.out.println("Player wins over dealer!");
        }//end if
        else 
        {
            System.out.println("Player loses to dealer!");
        }//end else
    }

    public Hand draw()
    {
        newCard = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
        CardsInHand += newCard;
        nCards+=1;
        int newTotalPoints = playerPoints + newCard.getPoints();
    }
}