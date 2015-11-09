import javax.swing.JOptionPane;
public class ClassMethodP6
{
    public static void main(String [] args)
    {

        String InputPassword = JOptionPane.showInputDialog( "What is your password?");
        String password = new String("abc*D_");
        String passLetter = new String(InputPassword.substring(3,4));
        System.out.println(passLetter);
        String oneLetter = new String(password.substring(3,4));
        System.out.println(oneLetter);

        if( oneLetter.compareTo(passLetter) == 0)
        {
            System.out.print("You have successfully logged in!");
        }
        else 
        {
            System.out.print("Wrong Password");
        }

    }// end method main
}// end class
