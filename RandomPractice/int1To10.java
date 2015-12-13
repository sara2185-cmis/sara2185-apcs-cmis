
/**
 * From Codingbat.com, 
Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is true, in which case return true if the number is less or equal to 1, or greater or equal to 10. 
 * 
 * @Sara 
 * @December 13, 2015
 */
public class int1To10
{public boolean in1To10(int n, boolean outsideMode) {
        if(1<= n && n <=10 && outsideMode == false)
        {
            return true;
        }
        else if( n <=1 || n >=10 && outsideMode == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

}
