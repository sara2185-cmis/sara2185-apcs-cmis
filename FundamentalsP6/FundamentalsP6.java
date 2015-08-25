
import javax.swing.JOptionPane;

public class FundamentalsP6 { 
  
  public static void main ( String args[] )
  {
   
    int array[] = new int[50];
    
    
    for( int i = 0; i < array.length; i++ )
    {
           array[i] = ((int) Math.random());
        
    } // end for loop
    for( int i = 0; i < array.length; i++)
    {
        System.out.println( array[i]);
    } // end for loop
    
    
       
    
  } // end main
} // end HelloWorld