
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
                if(i < heroes.size())
                {
                    if(heroes.get(i).isCaped() == true)
                    {
                        capedHeroes[row][col] = heroes.get(i);
                        heroes.remove(heroes.get(i));

                    }
                    else
                    {
                        if(i < heroes.size())
                        {
                            i++;
                        }
                    }
                }
                else
                {
                    capedHeroes[row][col] = null;
                }
            }
        }
        for(int row = 0; row < capedHeroes.length; row++)
        {
            for(int col = 0; col < capedHeroes[0].length; col++)
            {
                System.out.print(capedHeroes[row][col].getName() + "\t");
            }
            System.out.println();
        }
    }

}
