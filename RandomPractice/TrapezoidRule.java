import javax.swing.JOptionPane;
/**
 * I want to create a program that will perform the trapezoid rule (from Calculus).
 * 
 * @Sara
 * @November 24th
 */
public class TrapezoidRule
{
   public static void main( String[] args )
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("How many trapezoids are there?"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("What is the upper limit?"));
        double a = Double.parseDouble(JOptionPane.showInputDialog("What is the lower limit?"));
        //double equation = Double.parseDouble(JOptionPane.showInputDialog("What is the equation?"));
        double width = (b-a)/n;
        double length = 0.0;
        System.out.println(width);
        
        for( int i = 0; i < n; i ++)
        {
           length += n;
           double equation = Math.pow(length, 2);
            for(int j =1; j < n-1; j++)
            {
                equation = equation * 2;
                double area = (1/2) * width * equation;
                System.out.println(area);
            }
        }
        
        
    }
   
}
