
/**
 * 
 * @Sara
 * @January 24th, 2016
 */
public class FruitDriver
{
    public static void main ( String args[] )
    {
        FruitStore MyFruitStore = new FruitStore();
        System.out.print(MyFruitStore);
        System.out.println("The apple most suitable for making pie is apple number "+ MyFruitStore.pieMaking());
        System.out.println("And the banana most suitable for making banana bread is banana number "+ MyFruitStore.bananaBreadMaking());
    }
}
