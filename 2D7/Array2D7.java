
/**
 * Write a description of class Array2D7 here.
 * 
 * @Sara
 * @February 4th, 2016
 */
import javax.swing.JOptionPane;
public class Array2D7
{
    public static void main(String [] args)
    {
        int r = Integer.parseInt(JOptionPane.showInputDialog("How many rows?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("How many columns?"));
        int[][] gameboard = new int[r][c];
       for(int row = 0; row < gameboard.length; row++)
        {
            for(int col = 0; col < gameboard[0].length; col++)
            {
                gameboard[row][col] = (99*(int)Math.random())+1;
            }
        }
       gameboard[(int)Math.random()*r][(int)Math.random() * c] = 0;
        
        
    }
}