import javax.swing.JOptionPane;

public class FundamentalsP5 { 
  
  public static void main ( String args[] )
  {
   
    String[] movies = {"Lord of the Rings", "Belle", "From the Rough"};
    String[] songs = {"It's time", "The Scientist", "Chandelier"};
    String movie;
    String song;
    
    for( int i = 0; i < movies.length; i++ )
    {
           movie = movies[i];
        
    } // end for loop
    for( int i = 0; i < movies.length; i++)
    {
        System.out.println( movies[i]+ "\n" + "\n");
    } // end for loop
    int i = 0; 
   
   
    while (i < songs.length - 1)
    {
        System.out.print( songs[i] + ", ");
        i ++;
    } // end while loop
    System.out.print( songs[songs.length-1]);
    
       
    
  } // end main
} // end HelloWorld