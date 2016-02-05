public class Swapper
{
    public static void main ( String[] args )
    {
        /*
         * In the 2d array of integers below, find the row and the column with the highest product (disregard any zeros).
         * Then, find the value at the intersection of that row and column.
         * Then, swap all occurances of that value in the array for zero and all occurances of zero in the array for that value.
         * Print out the grid.
         * 
         * For example, if row 4 and column 5 have the largest products, the value at the intersection would be 7.
         * Then you would swap all 7s for 0s and 0s for 7s. The result would be this:
         * 9 7 2 5 7 9 7 5 8 5
         * 4 8 1 0 7 5 3 6 2 7
         * 0 0 5 6 7 5 6 6 4 7
         * 5 1 6 2 2 2 7 9 1 9
         * 7 0 8 9 7 0 4 3 8 6
         * 1 7 5 6 3 2 9 3 5 3
         * 5 3 1 4 9 9 1 3 4 8
         * 5 6 9 9 0 8 0 3 9 3
         * 1 7 4 8 3 1 7 2 1 5
         * 1 0 3 6 3 0 8 3 3 6
         */
        int rowProduct = 1;
        int colProduct = 1;
        int bigRowProduct = 0;
        int bigColProduct = 0;
        int colOfBigRow = 0;
        int rowOfBigCol = 0;
        int[][] grid = new int[][] {{9, 0, 2, 5, 0, 9, 0, 5, 8, 5},
                {4, 8, 1, 7, 0, 5, 3, 6, 2, 0},
                {7, 7, 5, 6, 0, 5, 6, 6, 4, 0},
                {5, 1, 6, 2, 2, 2, 0, 9, 1, 9},
                {0, 7, 8, 9, 0, 7, 4, 3, 8, 6},
                {1, 0, 5, 6, 3, 2, 9, 3, 5, 3},
                {5, 3, 1, 4, 9, 9, 1, 3, 4, 8},
                {5, 6, 9, 9, 7, 8, 7, 3, 9, 3},
                {1, 0, 4, 8, 3, 1, 0, 2, 1, 5},
                {1, 7, 3, 6, 3, 7, 8, 3, 3, 6}};
        /*
        for(int row = 0; row < grid.length; row++)
        {
        for(int col = 0; col < grid[0].length; col++)
        {
        System.out.print(grid[row][col] + " ");
        }
        System.out.println();
        }
         */
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col] != 0)
                {
                    rowProduct *= grid[row][col];
                    if(rowProduct > bigRowProduct)
                    {
                        bigRowProduct = rowProduct;
                        colOfBigRow = col-2;
                    }
                }
            }
            //System.out.println("The product of row " + row + " is " + rowProduct);
            rowProduct = 1;
        }
        for(int col = 0; col < grid[0].length; col++)
        {
            for (int row = 0; row < grid.length; row++)
            {
                if(grid[row][col] != 0)
                {
                    colProduct *= grid[row][col];
                    if(colProduct > bigColProduct)
                    {
                        bigColProduct = colProduct;
                        rowOfBigCol = row-6;//I don't know how to get the row of the bigColProduct or column of the bigRowProduct
                    }
                }
            }
            //System.out.println("The product of column " + col + " is " + colProduct);
            colProduct = 1;
        }
        //System.out.println("Highest product of row: " + bigRowProduct+ "in row: " + colOfBigRow);
        //System.out.println("Highest product of column: " + bigColProduct + "in col: " + rowOfBigCol);
        //System.out.println(grid[colOfBigRow][rowOfBigCol]);-> is equal to 9
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                if(grid[row][col] == grid[colOfBigRow][rowOfBigCol])
                {
                    grid[row][col] = 0;
                }
                else if(grid[row][col] == 0)
                {
                    grid[row][col] = grid[colOfBigRow][rowOfBigCol];
                }
            }
        }
        for(int row = 0; row < grid.length; row++)
        {
            for(int col = 0; col < grid[0].length; col++)
            {
                System.out.print(grid[row][col] + " ");
            }
            System.out.println();
        }
    }
}