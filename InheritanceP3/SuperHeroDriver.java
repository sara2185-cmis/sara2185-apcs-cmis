
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

        ArrayList<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(Rocky);
        heroes.add(Yolk);
        heroes.add(Bernie);
        
        int i = 0;
        for(SuperHero eachHero: heroes)
        {
            System.out.println(eachHero);
        }

        SuperHero[][] capedHeroes= new SuperHero[3][3];
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
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
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                System.out.print(capedHeroes[row][col]);
            }
            System.out.println();
        }
    }
}
