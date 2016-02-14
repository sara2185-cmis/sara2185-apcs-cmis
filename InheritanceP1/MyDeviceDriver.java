
/**
 * 
 * @Sara
 * @February 13th, 2016
 */
import java.util.ArrayList;
public class MyDeviceDriver
{
    public static void main(String[] args)

    {
        MyPhone phone1 = new MyPhone();
        MyPhone phone2 = new MyPhone(8, "Pink", "ATT");
        MyPod pod1 = new MyPod();
        MyPod pod2 = new MyPod(16, "Red");
        MyKindle kindle1 = new MyKindle();
        MyKindle kindle2 = new MyKindle(32, "White", 25);

        ArrayList<MyDevice> devices = new ArrayList<MyDevice>();
        devices.add(phone1);
        devices.add(phone2);
        devices.add(pod1);
        devices.add(pod2);
        devices.add(kindle1);
        devices.add(kindle2);
        
        for(MyDevice device: devices)
        {
            System.out.println(device);
        }
    }
}

