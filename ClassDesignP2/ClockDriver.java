import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main( String[] args )
    {
        int inputHour = ("%0d",Integer.parseInt(JOptionPane.showInputDialog("What hour is it?")));
        int inputMin = ("%0d",Integer.parseInt(JOptionPane.showInputDialog("What minutes is it?"));
        int inputSec = "%0d",Integer.parseInt(JOptionPane.showInputDialog("What seconds is it?"));
        
        Clock bedroomClock = new Clock("%0d",inputHour, "%0d",inputMin, "%0d",inputSec);
        Clock kitchenClock = new Clock();
        System.out.println( bedroomClock);
        System.out.println( kitchenClock);
    }//end method main
}// end class SongDriver
