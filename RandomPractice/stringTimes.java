
/**
 * from codingbat.com
 * 
 * @Sara
 * @December 3, 2015
 */
public class stringTimes
{
    // instance variables - replace the example below with your own
    public String stringTimes(String str, int n) {
        String output = "";
        for(int i = 0; i<n; i++)
        {
             output+= str;
        }
        output+= str;
        return output;
    }

}
