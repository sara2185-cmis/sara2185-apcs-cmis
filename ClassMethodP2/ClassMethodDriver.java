
import javax.swing.JOptionPane;
public class ClassMethodDriver
{
    public static void main( String[] args )
    {
        ClassMethod2 Clock = new ClassMethod2();
        System.out.println( Clock);
        Clock.setTime(13, 20, 20);
        System.out.println( Clock);
        Clock.convertDaylightSaving(13);
        System.out.println( Clock);
    }//end method main
}// end class ClockDriver
