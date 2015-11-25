public class EulerP5
{
    public static void main( String[] args )
    {
        for( int j = 0; j < 20; j++)
        {
            num = num*j;
            for (int i = 0; i < 20; i++)
            {
                if(num%i == 0)
                {
                    System.out.println(num);

                }//end if
            }//end for
        }
        

    }//end method main 
}// end class 