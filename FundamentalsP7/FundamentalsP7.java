
public class FundamentalsP7 { 
  
  public static void main ( String args[] )
  {
   
    int array[] = new int[10];
   
    for( int index = 0; index < array.length; index++ )
    {
           array[index] = (((int) Math.floor(Math.random() * 100)));
        
    } // end for loop
    
    int index = 0;
    while (index < array.length)
    {
        System.out.println( array[index]);
        index++;
    } // end while loop
    
    int negative = 0;
    int positive = 0;
    if (index%2 == 0)
       {
           negative = index * (int)(-1* (Math.random()* 100));
        }
    else 
       {
          positive = index * (int)(Math.random());
       }
    
    
    
  
    
    for( index = 0; index < array.length; index++)
    {
         System.out.print("The number of positive intergers is:" +  positive);
        
    }//end for loop
   
    
       
    
  } // end main
} // end HelloWorld
