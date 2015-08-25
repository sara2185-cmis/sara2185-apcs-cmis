import javax.swing.JOptionPane;

public class FundamentalsP3 { 
  
  public static void main ( String args[] )
  {
    String input1 = JOptionPane.showInputDialog( "Enter a number.");
   
    
    int num1 = Integer.parseInt( input1);
   
    
    if( num1 % 2 == 1)
       {
           System.out.println( num1 + " is an odd number.");
       } 
    else
        {
            System.out.println( num1 + " is an even number.");
        }
    
       
    
  } // end main
} // end HelloWorld