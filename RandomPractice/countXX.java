/**
 * from codingbat.com
 * 
 * @Sara
 * @December 5, 2015
 */public class countXX

{
    // instance variables - replace the example below with your own
    public int countXX(String str) {
        int count = 0;

        for(int i =0; i< str.length()-1; i++)
            if( str.substring(i, i+2).equals("xx"))
            {
                count++;

            }
        return count;
    }

}
