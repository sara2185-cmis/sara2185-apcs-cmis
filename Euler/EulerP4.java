public class EulerP4//I'm just printing all the factors
{
    public static void main( String[] args )
    {
        int num = 777;
        for (int i = 2; i < num; i++)
        {
            if(num%i == 0)// is a factor
            {
                System.out.println(i);
               
            }//end if
        }//end for
        
    }//end method main 
}// end class CardDriver