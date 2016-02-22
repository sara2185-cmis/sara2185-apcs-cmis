
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
        WaxMan Bernie = new WaxMan();
        Rocky.setSuitColor("Gray");
        Yolk.setSuitColor("Yellow");
        Bernie.setSuitColor("Red");
        Rocky.setCape(true);
        Yolk.setCape(false);
        Bernie.setCape(true);
        Rocky.setName("AsteroidMan");
        Yolk.setName("FriedEggMan");
        Bernie.setName("WaxMan");

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(Rocky);
        heroes.add(Yolk);
        heroes.add(Bernie);

        int size = heroes.size()-1;
        int i = 0;

        System.out.println("\nOriginal set of ArrayList heroes...");
        for(SuperHero eachHero: heroes)
        {
            System.out.println(eachHero);
        }

        SuperHero[][] capedHeroes = new SuperHero[3][3];
        /*
        for(int row = 0; row < capedHeroes.length; row++)
        {
        for(int col = 0; col < capedHeroes[0].length; col++)
        {
        if(hero.isCaped() == true)
        {
        capedHeroes[row][col] = hero;
        heroes.remove(hero);
        }

        }
        }

         */

     
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < heroes.size()-1)
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
                else
                {
                    capedHeroes[row][col] = null;
                }
            }
        }

        System.out.println("\nPrinting 2D Array capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < capedHeroes.length-1)
                {
                    System.out.print(capedHeroes[row][col].getName() + "\t");
                    i++;
                }
            }
            System.out.println();
        }

        System.out.println("\nPrinting contents of capedHeroes...");
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                if(i < capedHeroes.length-1)
                {
                    System.out.print(capedHeroes[row][col] + "\t");
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
