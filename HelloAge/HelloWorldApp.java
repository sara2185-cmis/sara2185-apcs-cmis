import javax.swing.JOptionPane;

public class HelloWorldApp { 
 
  public static void main ( String args[] ) 
  {
    String input1 = JOptionPane.showInputDialog( "What's your name?");
    String input2 = JOptionPane.showInputDialog( "How old are you?" );
                                            
  
    System.out.print( "Hello,"); System.out.print( input1); System.out.print(". You are "); System.out.print(input2); System.out.print(" years old.");  
  } // end main
} // end HelloWorld