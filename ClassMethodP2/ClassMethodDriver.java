
import javax.swing.JOptionPane;
public class ClassMethodDriver
{
    public static void main( String[] args )
    {
        ClassMethod2 Clock = new ClassMethod2();
        Clock.totalSeconds();
        System.out.println( Clock);
        System.out.println("\n\n");
        Clock.setTime(13, 20, 20);
        Clock.totalSeconds();
        System.out.println( Clock);
        System.out.println("\n\n");
        System.out.println("Because of Daylight Savings, the hour is now: " +  Clock.convertDaylightSaving(1));
        System.out.println( Clock);
    }//end method main
}// end class ClockDriver
