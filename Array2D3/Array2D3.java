/**
 * Write a description of class Array2D2 here.
 * 
 * @Sara
 * @January 29th, 2016
 */
import javax.swing.JOptionPane;

public class Array2D3
{
    public static void main (String[] args)
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        int[][] table = new int[r][c];
        int sum = 0;
        int rowSum = 0;
        int colSum = 0;
      
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                 table[0][col] = col;
                 table[row][0] = row;
            }
        }
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                table[row][col] = row * col;
            }
        }
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                System.out.print(row + table[row][col] + " ");
            }
            System.out.print("\n");
        }

    }

}