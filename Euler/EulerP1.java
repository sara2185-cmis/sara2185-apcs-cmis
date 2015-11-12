public class EulerP1
{
    public static void main( String[] args )
    {
        int value = 0;
        for(int i = 0; i < 1000; i++)
        {
            if (i%3== 0||i%5==0)
            {
                value +=i;
            }//end if

        }//end for loop
        System.out.print(value);
    }//end method main 
}// end class CardDriver
