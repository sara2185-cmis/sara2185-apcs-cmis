
/**
 * From Codingbat.com 
 * You are driving a little too fast, and a police officer stops you. Write code to compute the result, 
 * encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. 
 * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, 
 * the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday -- 
 * on that day, your speed can be 5 higher in all cases. 

 * @Sara
 * @December 6th, 2015
 */
public class caughtSpeeding
{
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if( speed <= 60 && isBirthday == false)
        {
            return 0;
        }
        else if(speed >=61 && speed <= 80 && isBirthday == false)
        {
            return 1;
        }
        else if(speed >= 81 && isBirthday == false)
        {
            return 2;
        }
        else if(speed <= 65 && isBirthday == true)
        {
            return 0;
        }
        else if(speed >= 66 && speed <= 85 && isBirthday == true)
        {
            return 1;
        }
        else if(speed >= 86 && isBirthday == true)
        {
            return 2;
        }
        else{
            return 0;
        }
    }
}
