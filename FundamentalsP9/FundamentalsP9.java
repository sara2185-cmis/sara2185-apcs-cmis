
import javax.swing.JOptionPane;
public class FundamentalsP9 { 

    public static void main ( String args[] )
    {
        String user = JOptionPane.showInputDialog( "What is your username?");
        String pass = JOptionPane.showInputDialog( "What is your password?");
        int password = Integer.parseInt(pass);
        if(( password == 1234) && user.equals("Sara"))
        {
            System.out.println (" You have successfully logged in");
     
        }
        else
        {
            System.out.println ("Login unsuccessful...try again");
        }
        } // end main


    }
