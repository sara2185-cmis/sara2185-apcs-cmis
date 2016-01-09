
/**
 * From Codingbat.com:
You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0. If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10. 

 * 
 * @Sara
 * @January 6th, 2016
 */
public class greenTicket
{
    public int greenTicket(int a, int b, int c) {
        if(a == b && b == c && c==a)
        {
            return 20;
        }
        else if (a !=b && b!= c && c!= a)
        {
            return 0;
        }
        else 
        {
            return 10;
        }

    }

}
