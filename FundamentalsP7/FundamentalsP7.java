
public class FundamentalsP7 { 
  
  public static void main ( String args[] )
  {
    int array[] = new int[10];
    int positive = 0;
    int negative = 0;
    
    for( int index = 0; index < array.length; index++ ) //this is to randomly multiply numbers by -1
    {
        
       int random = 0;
       random = (int)(Math.random() * 100);
          if (random%2 == 0)
       {
           array[index] = (int)(-1* (Math.random() *100));
           positive ++;
        }
        else 
       {
          array[index] = (int)(Math.random() * 100);
          negative ++;
       }
    } // end for loop
    
    int index = 0;
    while (index < array.length) // this is to print out the numbers in the array
    {
        System.out.println( array[index]);
        index++;
    } // end while loop
    
    
    System.out.println("The number of positive intergers is:" + negative );
  
  
  } // end main
} // end HelloWorld
