
import javax.swing.JOptionPane;

public class InputData
 {
 
  public static void main ( String args[] ) 
   {
    int sum = 0;
    int difference = 0;
    int product = 0;
    int quotient = 0;
    int modulo = 0;
      
    String input1 = JOptionPane.showInputDialog( "Type a number");
    String input2 = JOptionPane.showInputDialog( "Type another number or the same number.");
    
    int num1 = Integer.parseInt( input1 );
    int num2 = Integer.parseInt( input2 );
    
    sum = num1 + num2;
    difference = num1 - num2;
    product = num1 * num2;
    quotient = num1 / num2;
    modulo = num1 % num2;
    
    System.out.println( num1 + " + " + num2 + " = " + sum );  
    System.out.println( num2 + " + " + num1 + " = " + sum ); 
   
    System.out.println( num1 + " - " + num2 + " = " + difference );
    System.out.println( num2 + " - " + num1 + " = " + difference );
    
    System.out.println( num1 + " * " + num2 + " = " + product );
    System.out.println( num2 + " * " + num1 + " = " + product );
    
    System.out.println( num1 + " / " + num2 + " = " + quotient );
    System.out.println( num2 + " / " + num1 + " = " + quotient );
    
    System.out.println( num1 + " % " + num2 + " = " + quotient );
    System.out.println( num2 + " % " + num1 + " = " + modulo );
    
 
   }// end main
} // end HelloWorld