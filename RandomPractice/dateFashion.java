
/**
 * From codingbat.com
 * 
 * @Sara
 * @December 6th, 2015
 */
public class dateFashion
{
   public int dateFashion(int you, int date) {
  if(you <= 2 || date <= 2 )
  {
  return 0;
  }
  else if((you >= 8 || date >= 8) && (you > 2 || date > 2))
  {
  return 2;
  }
  else{
  return 1;
  }
}
}
