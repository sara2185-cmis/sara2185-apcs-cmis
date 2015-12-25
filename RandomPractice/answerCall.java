
/**
 * From Codingbat.com: 
Your cell phone rings. Return true if you should answer it. Normally you answer, except in the morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not answer. 
 * 
 * @Sara
 * @December 25th, 2015
 */
public class answerCall
{
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if( isAsleep == true)
        {
            return false;
        }
        else if(isMorning == true && isMom ==true)
        {
            return true;
        }
        else if(isMorning == true && isMom == false)
        {
            return false;
        }
        else{
            return true;
        }

    }

}
