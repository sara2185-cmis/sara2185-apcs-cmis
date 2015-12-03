
/**
 * from codingbat.com
 * 
 * @Sara 
 * @December 3, 2015
 */
public class diff21
{
    public int diff21(int n) {
        if ( n < 21)
        {
            return Math.abs(21-n);
        }
        else
        {
            return 2* Math.abs(21-n);
        }
    }

}
