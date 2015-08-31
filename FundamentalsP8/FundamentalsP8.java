
public class FundamentalsP8 { 
  
  public static void main ( String args[] )
  {
   
    String[] artists = {"Jessie J", "Ed Sheeran", "Ellie Goulding"};
    
   
    for( int index = 0; index < artists.length; index++)
    {
        System.out.print( artists[index] + " ");
    } // end for loop
    
    
    artists[(int) ( 2* Math.random())] = "Michael Jackson";
    for( int index = 0; index < artists.length; index++)
    {
        System.out.print( artists[index] + " ");
    } // end for loop
    System.out.print( "\n");
    
  } // end main
} // end HelloWorld
