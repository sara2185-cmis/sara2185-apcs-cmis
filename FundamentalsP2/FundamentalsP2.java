import javax.swing.JOptionPane;

public class FundamentalsP2 { 
  
  public static void main ( String args[] )
  {
    String input1 = JOptionPane.showInputDialog( "Enter a number.");
    String input2 = JOptionPane.showInputDialog( "Enter another number or the same number.");
    
    int num1 = Integer.parseInt( input1);
    int num2 = Integer.parseInt( input2);
    
    if( num1 > num2)
       {
           System.out.println( "The value of a is" + num1 + " and it is greater than b whose value is " + num2 + ".");
       } 
    if(num2 > num1)
        {
            System.out.println( "The value of a is " + num1 + " and it is less than b whose value is " + num2 + ".");
        }
    if(num1 == num2)
        {
            System.out.println( "The value of a is " + num1 + " and it is equal to b whose value is " + num2 + ".");
        }       
       
    
  } // end main
} // end HelloWorld