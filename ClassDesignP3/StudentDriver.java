
import javax.swing.JOptionPane;
public class StudentDriver
{
    public static void main( String[] args )
    {
       
        Student senior001 = new Student();
        Student junior001 = new Student("Emi", "Hayakawa", 11, 1606);
       
        JOptionPane.showMessageDialog( null, senior001, "CMIS Student", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog( null, junior001, "CMIS Student", JOptionPane.PLAIN_MESSAGE);
        
    }//end method main
}// end class StudentDriver
