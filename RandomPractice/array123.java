
/**
 * from codingbat.com
 * 
 * @Sara
 * @December 5, 2015
 */
public class array123
{
    public boolean array123(int[] nums) {
        for(int i = 0; i < nums.length; i++)
        {
            int j = ((int)Math.random() * nums[i]);
            if(j == 1 && j == 2 && j == 3) return true;

        }
        return false;
    }

}
