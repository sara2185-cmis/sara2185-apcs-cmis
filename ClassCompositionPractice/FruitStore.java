
/**
 * 
 * @Sara
 * @January 24th, 2016
 */
public class FruitStore
{
    Apple[] applesInStock = new Apple[3];
    Banana[] bananasInStock = new Banana[2];

    public FruitStore()
    {
        applesInStock[0] = new Apple();
        applesInStock[1] = new Apple("Red", 5, "Fuji", 7);
        applesInStock[2] = new Apple("Yellow", 8, "Golden Delicious", 8);
        bananasInStock[0] = new Banana();
        bananasInStock[1] = new Banana("Hom", 2, 9);
    }

    public int pieMaking()
    {
        int sweetest = 0;
        for(int i = 0; i < applesInStock.length; i++)
        {
            if(applesInStock[i].sweetness > applesInStock[sweetest].sweetness)
            {
                sweetest = i ;
            }
        }
        return sweetest +1 ;
    }
    public int bananaBreadMaking()
    {
        int oldest = 0;
        for(int i = 0; i < bananasInStock.length; i++)
        {
            if(bananasInStock[i].daysOld > bananasInStock[oldest].daysOld)
            {
                oldest = i;
            }
        }
        return oldest + 1;
    }

    public String toString()
    {
        String output = new String();
        output += "Apples: \n";
        for(Apple apples: applesInStock)
        {
            output += apples + "\n";
        }
        output += "Bananas: \n";
        for(Banana bananas: bananasInStock)
        {
            output += bananas + "\n";
        }
        return output;
    }
}
