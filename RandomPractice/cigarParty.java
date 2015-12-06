
/**
 * From codingbat.com
 * 
 * @Sara
 * @December 6th, 2015
 */
public class cigarParty
{
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if( cigars<= 60 && cigars>= 40 && isWeekend == false)
        {
            return true;
        }
        else if(cigars >= 40 && isWeekend == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

}
