import javax.swing.JOptionPane;

public class HelloWorldApp { 
 
  public static void main ( String args[] ) 
  {
    String input = JOptionPane.showInputDialog( "What's your name?");
    
    System.out.println( "Hello,"); System.out.println( input);
  } // end main
} // end HelloWorld