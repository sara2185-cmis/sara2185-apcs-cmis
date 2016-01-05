
/**
 * From Codingbat.com: Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception that if "bOk" is true, b does not need to be greater than a. 

 * 
 * @Sara
 * @January 3rd, 2015
 */
public class inOrder
{
    public boolean inOrder(int a, int b, int c, boolean bOk) {

        if(b > a && c > b && bOk == false)
        {
            return true;
        }
        else if(c > b && bOk == true)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
