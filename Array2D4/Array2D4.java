/**
 * Write a description of class Array2D2 here.
 * 
 * @Sara
 * @February 1st, 2016
 */
import javax.swing.JOptionPane;

public class Array2D4
{
    public static void main (String[] args)
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        String[][] table = new String[r][c];

        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                table[row][col] ={{"A", "B", "C", "D", "E"},{"F", "G", "H", "I", "J"},{"K", "L", "M", "N" "O"}};
            }
        }
            
        }
        for(int row = 0; row < table.length; row++)
        {
            for(int col = 0; col < table[0].length; col++)
            {
                System.out.print( table[row][col] + "\t");
            }
            System.out.print("\n");

        }
    }

}
