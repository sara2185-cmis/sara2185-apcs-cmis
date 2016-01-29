public class Array2D1
{
    public static void main (String[] args)
    {
        int[][] numbers = new int[3][4];
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
                numbers[row][col] = (int)((Math.random()*8)+1);
            }
        }
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
               System.out.print( numbers[row][col] + " ");
            }
            System.out.print("\n");
        }
        for(int row = 0; row < numbers.length; row++)
        {
            for(int col = 0; col < numbers[0].length; col++)
            {
                if( numbers[row][col] == 5)
                {
                    System.out.println("The row is: " +row + " and the column is" + col);
                }
            }
        }
    }
}