public class EulerP2
{
    public static void main( String[] args )
    {
        int value = 0;
        int one = 1;
        int two = 1;
        for(int i = 2; i < 4000000; i++)
        {
            i = (i-1) + (i-2);
            while (value < 4000000)
            {
            if (i%2 ==0)
            {
                value+=i;
            }
        }

        }//end for loop
        System.out.print(value);
    }//end method main 
}// end class CardDriver