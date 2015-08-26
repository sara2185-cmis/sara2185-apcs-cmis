
public class FundamentalsP8 { 
  
  public static void main ( String args[] )
  {
   
    String[] artists = {"Jessie J", "Ed Sheeran", "Ellie Goulding"};
    
   
    for( int index = 0; index < artists.length; index++)
    {
        System.out.print( artists[index] + " ");
    } // end for loop
    
    int index = 0;
    int index1 = ((int) (Math.random() * 2));
    artists[index1] = "Michael Jackson";
    
    System.out.print( artists[index1]);
       
    
  } // end main
} // end HelloWorld
