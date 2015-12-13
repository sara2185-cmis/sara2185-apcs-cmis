
/**
 * From codingbat.com, Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value. 
 * 
 * @Sara
 * December 13, 2015
 */
public class has271
{
    // instance variables - replace the example below with your own
    public boolean has271(int[] nums) {
        for(int i = 0; i <nums.length-2; i++)
        {
            int number = nums[i];
            if(nums[i+1] == number + 5 && Math.abs(nums[i+2] - (number-1)) <=2)
            {
                return true;
            }
        }
        return false;
    }

}
