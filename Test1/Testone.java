import javax.swing.JOptionPane;

public class Testone { 
  
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "Enter a number.");
    int length = Integer.parseInt( input );
    int array[] = new int [length];
    double nums = ((Math.random() * 51));// I was trying to use this as a variable to put in the for loop
    
    for( int index = 0; index < array.length; index++ ) // creating random number
    {
          array[index] = ((int)(Math.random() * 51));
        
    } // end for loop
    for( int index = 0; index < array.length; index++) // printing array of random numbers
    {
        System.out.println(index + ":" + array[index]);
    } // end for loop
   
    for( int index = array.length-1; index > 0; index-- )
    {

        if( array[index] % 2 == 0)// even number
        {
         
          System.out.println(index + ":" + "E" + array[index]);
          
        }// end if 
        
        else// odd number
        {
           System.out.println(index + ":" + "O" + array[index]);
         } // end else
        
    } // end for loop
    
  } // end main
} // end HelloWorld
