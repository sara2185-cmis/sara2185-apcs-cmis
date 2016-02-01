
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
        int rowSum0 = 0;
        int rowSum1 = 0;
        int rowSum2 = 0;
        int colSum0 = 0;
        int colSum1 = 0;
        int colSum2 = 0;
         int colSum3 = 0;
          int colSum4 = 0;
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

        for(int col = 0; col < numbers[0].length; col++)
        {
            rowSum0 += numbers[0][col];
            
        }
        System.out.println("The sum of row 0 " + " is " + rowSum0);
        for(int col = 0; col < numbers[0].length; col++)
        {
            rowSum1 += numbers[1][col];
            
        }
        System.out.println("The sum of row 1 " + " is " + rowSum1);
        for(int col = 0; col < numbers[0].length; col++)
        {
            rowSum2 += numbers[2][col];
            
        }
        System.out.println("The sum of row 2 " + " is " + rowSum2);
        for(int row = 0; row < numbers.length; row++)
        {
            colSum0 += numbers[row][0];
        }
        System.out.println("The sum of column 0 " + " is " + colSum0);
        for(int row = 0; row < numbers.length; row++)
        {
            colSum1 += numbers[row][1];
            
        }
        System.out.println("The sum of column 1 " + " is " + colSum1);
        for(int row = 0; row < numbers.length; row++)
        {
            colSum2 += numbers[row][2];
            
        }
        System.out.println("The sum of column 2 " + " is " + colSum2);
        for(int row = 0; row < numbers.length; row++)
        {
            colSum3 += numbers[row][3];
            
        }
        System.out.println("The sum of column 3 " + " is " + colSum3);
        for(int row = 0; row < numbers.length; row++)
        {
            colSum4 += numbers[row][4];
            
        }
        System.out.println("The sum of column 4 " + " is " + colSum4);

    }
}