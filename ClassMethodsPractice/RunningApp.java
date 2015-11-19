
public class RunningApp
{
    public static void main( String[] args )
    {
       
        Running today= new Running();
        System.out.println(today);
        System.out.println(today.kilometers(5.0));
        today.speed(1.0);
        today.setRunning(10.0);
        System.out.println(today);
        today.speed(2.0);
         System.out.println(today.kilometers(10.0));
       
    }//end method main
}// end class ShoeDriver
