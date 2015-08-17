
import javax.swing.JOptionPane;

public class HelloWorldApp { 
 
  public static void main ( String args[] ) 
  {
    int sum - 0;
      
    String input1 = JOptionPane.showInputDialog( "Type a number");
    String input2 = JOptionPane.showInputDialog( "Type another number or the same number.");
    
    int num1 = Integer.parseInt( input1 );
    int num2 = Integer.parseInt( input2 );
    
    sum = num1 + num2;
  } // end main
} // end HelloWorld