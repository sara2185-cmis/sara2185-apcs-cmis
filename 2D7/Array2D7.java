
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
        int rGuess = Integer.parseInt(JOptionPane.showInputDialog("Which row is zero in?"));
        int cGuess = Integer.parseInt(JOptionPane.showInputDialog("Which column is zero in?"));
        int[][] gameboard = new int[r][c];
        int randomRow =(int)(Math.random() * r);
        int randomColumn = (int)(Math.random() * c);
        gameboard[randomRow][randomColumn] = 0;
        int offByRow = Math.abs( randomRow - rGuess);
        int offByColumn = Math.abs( randomColumn - cGuess);
        for(int row = 0; row < gameboard.length; row++)
        {
            for(int col = 0; col < gameboard[0].length; col++)
            {
                gameboard[row][col] = (99*(int)Math.random())+1;
            }
        }
        for(int row = 0; row < gameboard.length; row++)
        {
            for(int col = 0; col < gameboard[0].length; col++)
            {
                System.out.print("X");
            }
            System.out.println();
        }

        if(gameboard[rGuess][cGuess] == 0)
        {
            System.out.println("You Won!");
        }
        else
        {
            System.out.println("You are off by " + offByRow + " rows and " + offByColumn + " columns");
            for(int row = 0; row < gameboard.length; row++)
            {
                for(int col = 0; col < gameboard[0].length; col++)
                {
                    if(gameboard[row][col] == gameboard[rGuess][cGuess])
                    {
                        System.out.print("No Bam!");
                    }
                    else
                    {
                        System.out.print("X");
                    }

                }
                System.out.println();
            }
        }
    }
}