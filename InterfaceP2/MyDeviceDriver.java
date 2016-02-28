/**
 * 
 * @Sara
 * @February 28th, 2016
 */
import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        BMTV oldTV = new BMTV();
        HDTV newTV = new HDTV();
        
        ArrayList<TV> TV = new ArrayList<TV>();
        TV.add(newTV);
        TV.add(oldTV);
        
        for(TV oneTV: TV)
        {
            System.out.print(TV.tvType() + " Am I on? " + TV.getTvOn() );
        }
        
        
        
        System.out.println("\n" + car1.discountable());
        System.out.println(car2.discountable());
    }
}
