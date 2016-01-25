
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
        System.out.println(runningTrail);
          System.out.println("The trail's total distance is " + runningTrail.getLength() + " kilometers");
        System.out.println(runningTrail.isDifficult(0, 13));
        System.out.println( runningTrail.isLevelTrailSegment(1, 10));
        
        ArrayList<Integer> randomMarkers = new ArrayList<Integer>();
        randomMarkers.add(30);
        randomMarkers.add(90);
        randomMarkers.add(80); 
        randomMarkers.add(40);
        randomMarkers.add(80);
        randomMarkers.add(20);
        Trail parkTrail = new Trail( randomMarkers);
        System.out.println("The trail's total distance is " + parkTrail.getLength() + " kilometers");
        System.out.println(runningTrail.isDifficult(0, randomMarkers.size()));
        System.out.println( runningTrail.isLevelTrailSegment(1, 10));
         
        ArrayList<Integer> newMarkers = new ArrayList<Integer>();
        newMarkers.add(30);
        newMarkers.add(90);
        newMarkers.add(70);
        newMarkers.add(30);
        Trail woodsTrail = new Trail( newMarkers);
       System.out.println("The trail's total distance is " + woodsTrail.getLength() + " kilometers");
        System.out.println("The trailwoodsTrail.isDifficult(0, newMarkers.size()));
        System.out.println( runningTrail.isLevelTrailSegment(1, 10));
        
       
    }
}
