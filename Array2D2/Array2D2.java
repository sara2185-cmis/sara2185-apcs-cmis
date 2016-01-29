
/**
 * Write a description of class Array2D2 here.
 * 
 * @Sara
 * @January 29th, 2016
 */
public class Array2D2
{
    public static void main (String[] args)
    {
        int[][] numbers = new int[3][5];
        int sum = 0;
        int rowSum = 0;
        int colSum = 0;
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
                numbers[row][col] = (int)((Math.random()*14)+1);
            }
        }
        for(int[] row: numbers)
        {
            for(int oneNum: row)
            {
               System.out.print(oneNum + " ");
            }
            System.out.print("\n");
        }
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
                   sum += numbers[row][col];
            }
        }
        System.out.println("The sum total of all 15 elements is " + sum);
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
                   rowSum += numbers[row][col];
                   System.out.println("The sum of row " + row + " is " + rowSum);
            }
        }
       
    }

}