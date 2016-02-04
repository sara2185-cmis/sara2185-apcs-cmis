import javax.swing.JOptionPane;
public class PasswordCreator
{
    public static void main(String [] args)
    {
        String lastName = JOptionPane.showInputDialog( "What is your lastname?");
        String password = JOptionPane.showInputDialog( "What is your password?");
        int compare = 0;
        String lastNameLowerCase = lastName.toLowerCase();

        for (int i = 0; i < password.length(); i++)
        {
            String firstLetter = new String(password.substring(i, i+1));
            String firstLetterOfLastName = new String(lastName.substring(i, i+1));
            String restOfPassWord = new String(password.substring(i+1, password.length()-1));
            String restOfLastName = new String(lastName.substring(i+1, lastName.length()-1));
            String restOfLastName = new String(lastName.substring(i+1, lastName.length()-1));
            System.out.print(restOfPassWord);
            if(firstLetter.equals(firstLetterOfLastName) && restOfPassWord.equals(restOfLastName ))
            {
                compare = 1;
            }
            

        }
        if(password.length() >= 6 && compare == 1)
        {
            System.out.print("You have successfully logged in");
        }
        else{

            System.out.print("Wrong password");
        }
    }
}

