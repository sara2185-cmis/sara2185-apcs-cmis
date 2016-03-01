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
        BWTV oldTV = new BWTV();
        HDMI newTV = new HDMI();
        
        ArrayList<TV> TV = new ArrayList<TV>();
        TV.add(newTV);
        TV.add(oldTV);
        
        for(TV oneTV: TV)
        {
            System.out.println(oneTV.tvType() + " Am I on? " + oneTV.getTvOn() );
        }
        for(int i = 0; i < TV.size(); i++)
        {
            TV.get(i).setTvOn(true);
        }
        System.out.println();
        for(TV oneTV: TV)
        {
            System.out.println(oneTV.tvType() + " Am I on? " + oneTV.getTvOn() );
        }
        
        
        System.out.println(oldTV.rotateRabbitEars());
        System.out.println(newTV.connectHDMI());
        
        
      
    }
}
