
/**
 * 
 * @Sara
 * @January 20th, 2016
 */
public class ClockDriver
{
    public static void main ( String args[] )
    {
        ClockStore MyClockStore = new ClockStore();
        System.out.print(MyClockStore);
        System.out.print("The clock with the most seconds is clock number " + MyClockStore.mostSeconds());
    }
}
