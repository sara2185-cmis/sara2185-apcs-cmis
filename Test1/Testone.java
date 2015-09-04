import javax.swing.JOptionPane;

public class Testone { 
  
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "Enter a number.");
    int length = Integer.parseInt( input );
    int array[] = new int [length];
    double random = (50 * (Math.random()));
    
     for( int index = 0; index < array.length; index++ )
    {
           array[index] = (( Math.floor(Math.random() * 51));
        
    } // end for loop
    for( int index = 0; index < array.length; index++ )
    {
           System.out.println(array[index] );
        
    } // end for loop
    
    
    
    
  } // end main
} // end HelloWorld
