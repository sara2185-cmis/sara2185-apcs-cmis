
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

        for(SuperHero eachHero: heroes)
        {
            System.out.println(eachHero);
        }
        
        SuperHero[][] capedHeroes= new SuperHero[3][3];
         for(SuperHero eachHero: heroes)
        {
            if(heroes.isCaped() == true)
            {
                capedHeroes += heroes;
            }
        }
    }
}
