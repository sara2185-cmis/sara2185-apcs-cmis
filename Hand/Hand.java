public class Hand
{
    private int nCards;
    private int totalPoints = 0;
    private Card cardsInHand;
    private String name;

    public Hand()
    {
        nCards = 2;
        cardsInHand = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
        
    }
     public void thisHand(String name)
    {
        nCards = 2;
        cardsInHand =  new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
        this.name = name;
    }
    public int getPoints()
    {
        for(int i = 0; i < nCards; i++)
        {
            if(cardsInHand.rank == "2")
            {
                value = 2;
            }// end if
            if(cardsInHand.rank == "3")
            {
                value = 3;
            }// end if
            if(cardsInHand.rank == "4")
            {
                value = 4;
            }// end if
            if(cardsInHand.rank == "5")
            {
                value = 5;
            }// end if
            if(cardsInHand.rank == "6")
            {
                value = 6;
            }// end if
            if(cardsInHand.rank == "7")
            {
                value = 7;
            }// end if 
            if(cardsInHand.rank == "8")
            {
                value = 8;
            }// end if
            if(cardsInHand.rank == "9")
            {
                value = 9;
            }// end if
            if(cardsInHand.rank == "K" || cardsInHand.rank == "Q" || cardsInHand.rank == "J"|| cardsInHand.rank == "10")
            {
                value = 10;
            }//end if
            if(cardsInHand.rank == "A")
            {
                value = 11;
            }//end if
            totalPoints += value;
            if(totalPoints > 21)
            {
                totalPoints= totalPoints - 10;
            }// end if
        }// end for

    }
    public int compare(Hand dealer)
    {
        int totalPoints = getPoints();
        int dealerPoints = dealer.getPoints(); 
            if (totalPoints == 21)
            {
                System.out.println("Player got blackjack and wins!");
            }//end if
            else if (totalPoints > dealerPoints)
            {
                System.out.println("Player wins over dealer!");
            }//end if
            else 
            {
                System.out.println("Player loses to dealer!");
            }//end if
        

    }

    public Hand draw()
    {
         newCard = new Card(suit[(int)(Math.random() *4)], rank[(int)(Math.random() *13)]);
         CardsInHand += newCard;
        nCards+=1;
        newTotalPoints = totalPoints + newCard.getPoints();
   
        

    }
}