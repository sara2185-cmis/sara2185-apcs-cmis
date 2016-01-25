
/**
 * Write a description of class Trail here.
 * 
 * @Sara
 * @January 25th, 2016
 */
import java.util.ArrayList;
public class Trail
{
    ArrayList<Integer> markers = new ArrayList<Integer>();

    public Trail()
    {
        markers.add(15);
        markers.add(35);
        markers.add(20);
        markers.add(45);
        markers.add(60);
        markers.add(55);
        markers.add(70);
        markers.add(45);
        markers.add(65);
        markers.add(80);
        markers.add(75);
        markers.add(90);
        markers.add(100);

    }

    public Trail(ArrayList<Integer> markers)
    {
        this.markers = markers;
    }

    public void addMarker(int addition, int index)
    {
        markers.get(index)+= addition;
    }

    public void isLevelTrailSegment(int begin, int end)
    {
       begin = markers.get(i);
       end = markers.get(markers.size()-1);
       for( int i = 0; i < markers.size(); i++)
    {
    }
       if( begin == end &&)
       {
        }
    }

    public String toString()
    {
        String output = new String();
        for(int i = 0; i < markers.size(); i++)
        {
            output += i + " " + markers.get(i) + "\n";
        }
        return output;
    }
}
