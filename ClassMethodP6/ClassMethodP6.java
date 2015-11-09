import javax.swing.JOptionPane;
public class ClassMethodP6
{
    public static void main(String [] args)
    {
        String password = JOptionPane.showInputDialog( "What is your password?");
        String compare = "";

        for (int i = 0; i < password.length(); i++)
        {
            String oneLetter = new String(password.substring(i, i+1));
            if(oneLetter.equals("*"))
            {
                compare = "yes";
            }
            else if(oneLetter.equals("-"))
            {
                compare = "yes";
            }

            else if(oneLetter.equals("@"))
            {
                compare = "yes";
            }
            else if(oneLetter.equals("/"))
            {
                compare = "yes";
            }
            else if(oneLetter.equals("+"))
            {
                compare = "yes";
            }
            else 
            {
                compare = "no";
            }

        }
        if(password.length() > 6 && compare.equals("yes"))
        {
            System.out.print("You have successfully logged in");
        }
        else{

            System.out.print("Wrong password");
        }
    }
}

