
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
        MyPod2 carPod = new MyPod2("Green", 8, allSongs);
        System.out.println(carPod);
    }
}

