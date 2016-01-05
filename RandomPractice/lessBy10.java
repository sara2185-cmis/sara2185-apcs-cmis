
/**
 * From Codingbat.com: Given three ints, a b c, return true if one of them is 10 or more less than one of the others. 
examples:
lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 * 
 * @Sara
 * @January 3rd, 2016
 */
public class lessBy10
{
    public boolean lessBy10(int a, int b, int c) {
        if(a-10 >= b || b-10 >= a || c-10 >= b || b-10 >= c|| a-10 >= c|| c-10 >= a)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
    // 2nd way to do it:
    public boolean lessBy102(int a, int b, int c) {
        if(Math.abs(a-b) >= 10|| Math.abs(a-c) >= 10 || Math.abs(b-c) >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
