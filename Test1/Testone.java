import javax.swing.JOptionPane;

public class Testone { 
  
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "Enter a number.");
    int length = Integer.parseInt( input );
    int array[] = new int [length];
     
    for( int index = 0; index < array.length; index++ )
    {
          array[index] = ((int)(Math.random() * 51));
        
    } // end for loop
    for( int index = 0; index < array.length; index++)
    {
        System.out.println(index + ":" + array[index]);
    } // end for loop
   
    for( int index = array.length-1; index > 0; index-- )
    {
        int even = array[index];
        if( array[index] % 2 == 0)
        {
            
          System.out.println(index + ":" + "E" + array[index]);
          
        } 
        
        else
        {
           System.out.println(index + ":" + "O" + array[index]);
         }
        
    } // end for loop
    
   
  } // end main
} // end HelloWorld
