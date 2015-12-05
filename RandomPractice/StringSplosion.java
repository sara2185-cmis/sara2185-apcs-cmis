
/**from CodingBat.com
 * 
 * @Sara
 * @December 5, 2015
 */
public class StringSplosion
{
    // instance variables - replace the example below with your own
    public String stringSplosion(String str) {
        String output = "";
        for(int i = 0; i < str.length(); i ++)
        {
            output += str.substring(0,i+1);
            

        }
        return output;
    }
}
