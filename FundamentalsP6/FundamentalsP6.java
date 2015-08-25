

public class FundamentalsP6 { 
  
  public static void main ( String args[] )
  {
   
    int array[] = new int[50];
    
    
    for( int index = 0; index < array.length; index++ )
    {
           array[index] = ((int) Math.floor(Math.random() * 101));
        
    } // end for loop
    for( int index = 0; index < array.length; index++)
    {
        System.out.print( array[index] + " ");
    } // end for loop
    
    
       
    
  } // end main
} // end HelloWorld