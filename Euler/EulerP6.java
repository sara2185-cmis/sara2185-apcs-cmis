
/**
 * Write a description of class EulerP6 here.
 * 
 * @Sara 
 * @January 9th, 2016
 */
public class EulerP6
{
    public static void main(String[] args)
    {
        int sumOfSquares = 0;
        int squareOfSums = 0;
        int sum = 0;
        int difference = 0;
        for(int i = 0; i < 100; i++)
        {
            sumOfSquares += i*i;
        }
        for(int i = 0; i < 100; i++)
        {
            sum += i;
            
            squareOfSums = sum * sum;
        }
        difference = squareOfSums - sumOfSquares;
        System.out.print(difference);
    }
}
