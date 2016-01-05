
/***From Codingbat.com: Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged. 
 * @Sara
 * @January 3rd, 2016
 */
public class fizzString
{
    public String fizzString(String str) {

        if(str.substring(str.length()-1).equals("b") && str.substring(0,1).equals("f"))
        {
            return "FizzBuzz";
        }
        else if(str.substring(str.length()-1).equals("b"))
        {
            return "Buzz";
        }
        else if(str.substring(0,1).equals("f"))
        {
            return "Fizz";
        }
        else 
        {
            return str;
        }

    }
}
