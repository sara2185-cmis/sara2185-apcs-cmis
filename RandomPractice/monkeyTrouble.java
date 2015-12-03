
/**
 * From codingbat.com
 * 
 * @Sara
 * @December 3, 2015
 */
public class monkeyTrouble
{
    // instance variables - replace the example below with your own
    private int x;

    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if((aSmile && bSmile) || (!aSmile && !bSmile))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
