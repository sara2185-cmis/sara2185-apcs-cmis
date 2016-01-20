
/**
 * @Sara
 * @January 20th, 2016
 */
import java.util.ArrayList;

public class MyPodDriver
{
    public static void main ( String args[] )
    {
        ArrayList<String> allSongs = new ArrayList<String>();
        allSongs.add("Hello");
        allSongs.add("Rolling in the Deep");
        allSongs.add("Set Fire to the Rain");
        MyPod carPod = new MyPod();
        System.out.println("For P1:\n" + carPod);
        MyPod2 homePod = new MyPod2("Green", 8, allSongs);
        System.out.println("For P5:\n" + homePod);
    }
}

