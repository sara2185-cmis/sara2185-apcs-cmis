
/**
 * From Codingbat.com
 * 
 * @Sara
 * @December 3, 2015
 */
public class sleepIn
{
    // instance variables - replace the example below with your own
    private boolean weekday;
    private boolean vacation;

    public void SleepIn(boolean weekday, boolean vacation)
    {
        this.weekday = weekday;
        this.vacation = vacation;
    }
    public boolean SleepInOrNot(int y)
    {
        if (!weekday || vacation)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
