import javax.swing.JOptionPane;
public class ClassMethodP6
{
    public static void main(String [] args)
    {
        String password = JOptionPane.showInputDialog( "What is your password?");
        int compare = 0;

        for (int i = 0; i < password.length(); i++)
        {
            String oneLetter = new String(password.substring(i, i+1));
            if(oneLetter.equals("*"))
            {
                compare = 1;
            }
            else if(oneLetter.equals("-"))
            {
                compare = 1;
            }

            else if(oneLetter.equals("@"))
            {
                compare = 1;
            }
            else if(oneLetter.equals("/"))
            {
                compare = 1;
            }
            else if(oneLetter.equals("+"))
            {
                compare = 1;
            }
            
        }
        if(password.length() > 6 && compare == 1)
        {
            System.out.print("You have successfully logged in");
        }
        else{

            System.out.print("Wrong password");
        }
    }
}

