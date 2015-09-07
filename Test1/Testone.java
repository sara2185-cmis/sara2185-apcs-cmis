import javax.swing.JOptionPane;

public class Testone { 
  
  public static void main ( String args[] )
  {
    String input = JOptionPane.showInputDialog( "Enter a number.");
    int length = Integer.parseInt( input );
    int array[] = new int [length];
    int nums = ((Math.random() * 50));// I was trying to use this as a variable to put in the for loop
    
    for( int index = 0; index < array.length; index++ ) // creating random number
    {
          array[index] = ((Math.random() * 50));
        
    } // end for loop
    for( int index = 0; index < array.length; index++) // printing array of random numbers
    {
        System.out.println(index + ":" + array[index]);
    } // end for loop
   
    for( int index = array.length-1; index >= 0; index-- )
    {

        if( array[index] % 2 == 0)// even number
        {
          System.out.print(index + ":");
          for( int E = 0; E < array[index]; E++)
          {
             System.out.print("E"); 
            } // end for loop
           System.out.println(array[index]);
        }// end if statement
        
        else// odd number
        {
          System.out.print(index + ":");
            for( int O = 0; O < array[index]; O++)
          {
             System.out.print("O"); 
            } // end for loop
             System.out.println(array[index]);
         } // end else statement
        
    } // end for loop
    
  } // end main
} // end HelloWorld
