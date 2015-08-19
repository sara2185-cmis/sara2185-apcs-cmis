
import javax.swing.JOptionPane;

public class InputData
 {
 
  public static void main ( String args[] ) 
   {
    float sum = 0;
    float difference1 = 0;
    float product = 0;
    float quotient1 = 0;
    float modulo1 = 0;
      
    float difference2 = 0;
    float quotient2 = 0;
    float modulo2 = 0;
    
    String input1 = JOptionPane.showInputDialog( "Type a number");
    String input2 = JOptionPane.showInputDialog( "Type another number or the same number.");
    
    float num1 = Integer.parseInt( input1 );
    float num2 = Integer.parseInt( input2 );
    
    sum = num1 + num2;
    difference1 = num1 - num2;
    difference2 = num2 - num1;
    product = num1 * num2;
    quotient1 = num1 / num2;
    quotient2 = num2 / num1;
    modulo1 = num1 % num2;
    modulo2 = num2 % num1;
    
    System.out.println( num1 + " + " + num2 + " = " + sum );  
    System.out.println( num2 + " + " + num1 + " = " + sum ); 
   
    System.out.println( num1 + " - " + num2 + " = " + difference1 );
    System.out.println( num2 + " - " + num1 + " = " + difference2 );
    
    System.out.println( num1 + " * " + num2 + " = " + product );
    System.out.println( num2 + " * " + num1 + " = " + product );
    
    System.out.println( num1 + " / " + num2 + " = " + quotient1 );
    System.out.println( num2 + " / " + num1 + " = " + quotient2 );
    
    System.out.println( num1 + " % " + num2 + " = " + modulo1 );
    System.out.println( num2 + " % " + num1 + " = " + modulo2 );
    
 
   }// end main
} // end HelloWorld