
public class SimpleCardApp
{
    public static void main( String[] args )
    {
        SimpleCard Deck[] = new SimpleCard[52];
        String suit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for(int i = 0; i < 13; i++)
        {
            Deck[i] = new SimpleCard(suit[0], rank[i]);
            Deck[i+ rank.length] = new SimpleCard(suit[1], rank[i]);
            Deck[i+ (2* rank.length)] = new SimpleCard(suit[2], rank[i]);
            Deck[i + (3*rank.length)] = new SimpleCard(suit[3], rank[i]);
        }//end for loop
       
        for ( int i = 0; i < 5; i++ )
        {
            System.out.println(Deck[(int)(Math.random() * 52)]);
        }//end for loop

        }//end method main 
    }// end class CardDriver

