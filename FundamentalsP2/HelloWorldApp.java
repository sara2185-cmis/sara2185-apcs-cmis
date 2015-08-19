import javax.swing.JOptionPane;

public class HelloWorldApp { 
  
  public static void main ( String args[] )
  {
    String input1 = JOptionPane.showInputDialog( "Enter a number.");
    String input2 = JOptionPane.showInputDialog( "Enter another number or the same number.");
    
    int num1 = Integer.parseInt( input1);
    int num2 = Integer.parseInt( input2);
    
    if( num1 > num2)
       {
           System.out.println( num1 " is greater than " num2)
       }              
    
  } // end main
} // end HelloWorld