
/**
 * 
 * @Sara
 * @February 13th, 2016
 */
import java.util.ArrayList;
public class SuperHeroDriver
{
    public static void main(String[] args)

    {
        AsteroidMan Rocky = new AsteroidMan();
        FriedEggMan Yolk = new FriedEggMan();
        CandleMan Bernie = new CandleMan();
        Rocky.setSuitColor("Gray");
        Yolk.setSuitColor("Yellow");
        Bernie.setSuitColor("Red");
        Rocky.setCape(false);
        Yolk.setCape(true);
        Bernie.setCape(true);
        Rocky.setName("AsteroidMan");
        Yolk.setName("FriedEggMan");
        Bernie.setName("CandleMan");

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(Rocky);
        heroes.add(Yolk);
        heroes.add(Bernie);
        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int i = 0;

        System.out.println("\nOriginal set of ArrayList heroes...");
        for(SuperHero eachHero: heroes)
        {
            System.out.println(eachHero);
        }

        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < heroes.size())
                {
                    if(heroes.get(i).isCaped() == true)
                    {
                        capedHeroes[row][col] = heroes.get(i);
                        heroes.remove(heroes.get(i));
                    }
                    else
                    {
                        i++;
                    }
                }
            }
        }

        System.out.println("\nPrinting 2D Array capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(capedHeroes[row][col] != null)
                {
                    System.out.print(capedHeroes[row][col].getName() + "\t");
                }
                else
                {
                    System.out.print(capedHeroes[row][col] + "\t");
                }
                i++;

            }
            System.out.println();
        }

        System.out.println("\nPrinting contents of capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
               if(capedHeroes[row][col] != null)
               {
                    System.out.println(capedHeroes[row][col] + "\t");
                    i++;
                }
            }
            System.out.println();
        }

        System.out.println("\nRemaining set of ArrayList heroes...");
        for(SuperHero eachHero: heroes)
        {
            System.out.println(eachHero);
        }
    }
}
