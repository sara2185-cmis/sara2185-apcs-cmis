import javax.swing.JOptionPane;
public class ClockDriver
{
    public static void main( String[] args )
    {
        int inputHour =( Integer.parseInt(JOptionPane.showInputDialog("What hour is it?")));
        int inputMin = ( Integer.parseInt(JOptionPane.showInputDialog("What minutes is it?")));
        int inputSec = ( Integer.parseInt(JOptionPane.showInputDialog("What seconds is it?")));
        
        Clock bedroomClock = new Clock(String.format("%02d",inputHour, "%02d",inputMin, "%02d",inputSec));
        Clock kitchenClock = new Clock();
        System.out.println( bedroomClock);
        System.out.println( kitchenClock);
    }//end method main
}// end class ClockDriver
