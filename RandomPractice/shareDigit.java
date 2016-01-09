
/**
 * From Codingbat.com: Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.) 

 * 
 * @Sara
 * @January 9th, 2016
 */
public class shareDigit
{
    public boolean shareDigit(int a, int b) {
  if(a%10 == b%10 || a%10 == b/10 || a/10 == b%10 || a/10 == b/10)
  {
  return true;
  }
  else
  {
  return false;
  } 
}

}
