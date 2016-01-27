
/**
 * 
 * @Sara
 * @January 25th, 2016
 */
import java.util.ArrayList;
public class TrailDriver
{
    public static void main( String[] args )
    {
        Trail runningTrail = new Trail();
        System.out.println("RUNNING TRAIL: \n" + runningTrail);
        System.out.println("The running trail's total distance is " + runningTrail.getLength() + " kilometers");
        System.out.println("The running trail is difficult: " + runningTrail.isDifficult(0, runningTrail.markers.size()-1));
        System.out.println("The running trail from marker number 5 to 9 is difficult: " + runningTrail.isDifficult(5, 9));
        System.out.println("The running trail is level: " + runningTrail.isLevelTrailSegment(0, runningTrail.markers.size()-1));
        System.out.println("The running trail from marker number 3 to 7 is level: " + runningTrail.isLevelTrailSegment(3, 7)+ "\n");
     

        ArrayList<Integer> randomMarkers = new ArrayList<Integer>();
        randomMarkers.add(100);
        randomMarkers.add(90);
        randomMarkers.add(80); 
        randomMarkers.add(60);
        randomMarkers.add(70);
        randomMarkers.add(50);
        randomMarkers.add(20);
        randomMarkers.add(10);
        Trail parkTrail = new Trail( randomMarkers);
        System.out.println("PARK TRAIL: \n" + parkTrail);
        System.out.println("The park trail's total distance is " + parkTrail.getLength() + " kilometers");
        System.out.println("The park trail is difficult: "+ parkTrail.isDifficult(0, randomMarkers.size()-1));
        System.out.println("The park trail from marker number 2 to 7 is difficult: "+ parkTrail.isDifficult(2, 7));
        System.out.println("The park trail is level: " + parkTrail.isLevelTrailSegment(0, randomMarkers.size()-1));
        System.out.println("The park trail from marker number 3 to 6 is level: " + parkTrail.isLevelTrailSegment(3, 6) + "\n");

        ArrayList<Integer> newMarkers = new ArrayList<Integer>();
        newMarkers.add(30);
        newMarkers.add(35);
        newMarkers.add(25);
        newMarkers.add(25);
        newMarkers.add(30);
        newMarkers.add(30);
        newMarkers.add(35);
        newMarkers.add(30);
        Trail woodsTrail = new Trail( newMarkers);
        System.out.println("WOODS TRAIL: \n" + woodsTrail);
        System.out.println("The woods trail's total distance is " + woodsTrail.getLength() + " kilometers");
        System.out.println("The woods trail is difficult: "+ woodsTrail.isDifficult(0, newMarkers.size()-1));
        System.out.println("The woods trail from marker number 3 to 5 is difficult: "+ woodsTrail.isDifficult(3, 5));
        System.out.println("The woods trail is level: " + woodsTrail.isLevelTrailSegment(0, newMarkers.size()-1));
        System.out.println("The woods trail from marker number 2 to 6 is level: " + woodsTrail.isLevelTrailSegment(2, 6));

    }
}
