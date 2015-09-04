import javax.swing.JOptionPane;

public class Testone { 
  
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "Enter a number.");
    int length = Integer.parseInt( input );
    int array[] = new int [length];
     
    for( float index = 0; index < array.length; index++ )
    {
           array[index] = ( Math.floor(Math.random() * 51));
        
    } // end for loop
    for( float index = 0; index < array.length; index++)
    {
        System.out.println(index + ":" + array[index]);
    } // end for loop
   
    for( float index = array.length-1; index > 0; index-- )
    {
           System.out.println(index + ":" + array[index]);
        
    } // end for loop
    
  } // end main
} // end HelloWorld
