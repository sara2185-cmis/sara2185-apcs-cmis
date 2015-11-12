public class MrKiefferApp
{

    public static void main (String[] args)
    {
        String[] suits = {"H", "D", "S", "C"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        SimpleCard[] deck1 = new SimpleCard[52];
        SimpleCard[] deck2 = new SimpleCard[52];
        SimpleCard[] deck3 = new SimpleCard[52];
        String rank;
        String suit;

        // Method 1
        int index = 0;
        for ( int i = 0 ; i < suits.length; i++ )
        {
            for ( int j = 0; j < ranks.length; j++ )           
            {
                suit = suits[i];
                rank = ranks[j];
                deck1[index] = new SimpleCard( suit, rank );
                index++;
            }
        }

        // Method 2
        for ( int i = 0; i < ranks.length; i++ ){
            deck2[i] = new SimpleCard( "H", ranks[i]);
            deck2[i + ranks.length] = new SimpleCard( "D", ranks[i]);
            deck2[i + ( 2 * ranks.length)] = new SimpleCard( "S", ranks[i]);
            deck2[i + (3 * ranks.length)] = new SimpleCard( "C", ranks[i]);
        }

        // Method 3
        for (int i = 0; i < deck3.length; i++ )
        {   
            System.out.println(String.format("%d %d %d", i, i % suits.length, i % ranks.length));
            deck3[i] = new SimpleCard( suits[i % 4], ranks[i % 13]);
        }

        for ( int i = 0; i < 5; i++ ){
            System.out.println(deck3[(int)(Math.random() * deck3.length) ]);
        }
    }

}