
/**
 * From Codingbat.com, Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky. So if either value is a teen, just return 19. 
 * @Sara
 * @December 25th, 2015
 */
public class teenSum
{
    public int teenSum(int a, int b) {

        if( (a <= 19 && a >= 13) || (b <= 19 && b >= 13))
        {
            return 19;
        }
        else{
            return a + b;

        }
    }
}
