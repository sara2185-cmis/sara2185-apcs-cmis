import javax.swing.JOptionPane;
/**
 * I want to create a program that will do the trapezoid rule (from Calculus).
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
        double width = (b-a)/n;
        System.out.println(width);
        
    }
   
}
