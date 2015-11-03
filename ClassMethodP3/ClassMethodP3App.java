
import javax.swing.JOptionPane;
public class ClassMethodP3App
{
    public static void main( String[] args )
    {
       
        ClassMethodP3 senior001 = new ClassMethodP3();
        ClassMethodP3 junior001 = new ClassMethodP3("Emi", "Hayakawa", 11, 1606);
       
        JOptionPane.showMessageDialog( null, senior001, "CMIS Student", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog( null, junior001, "CMIS Student", JOptionPane.PLAIN_MESSAGE);
        
    }//end method main
}// end class StudentDriver

