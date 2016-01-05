
/**
 * From Codingbat.com: Given three ints, a b c, return true if two or more of them have the same 
 * rightmost digit. The ints are non-negative. 
 * example: lastDigit(23, 19, 13) → true     lastDigit(23, 19, 12) → false    lastDigit(23, 19, 3) → true

 * 
 * @Sara
 * @January 3rd, 2016
 */
public class lastDigit
{public boolean lastDigit(int a, int b, int c) {
        if( a%10 == b%10 || a%10 == c%10 || b%10 == c%10)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

}
