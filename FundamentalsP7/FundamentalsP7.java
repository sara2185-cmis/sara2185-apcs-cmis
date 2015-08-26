
public class FundamentalsP7 { 
  
  public static void main ( String args[] )
  {
   
    int array[] = new int[10];
    int one = -1;
    
    for( int index = 0; index < array.length; index++ )
    {
           array[index] = (((int) Math.floor(Math.random() * 101)) * one);
        
    } // end for loop
    
    int index = 0;
    while (index < array.length)
    {
        System.out.println( array[index]);
        index++;
    } // end while loop
    
    boolean even = index%2 == 0
    
  
    
    for( index = 0; index < array.length; index++)
    {
         System.out.print("The number of positive intergers is:" +  even);
        
    }//end for loop
   
    
       
    
  } // end main
} // end HelloWorld
