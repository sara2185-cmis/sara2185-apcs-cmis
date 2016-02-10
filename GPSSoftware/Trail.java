
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
        markers.add(50);
        markers.add(55);
        markers.add(50);
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

    public int getLength()
    {
        int length = 0;
        for(int i = 0; i < markers.size(); i++)
        {
            length += markers.get(i);
        }
        return length;
    }

    public void addMarker(int addition)
    {
        markers.add(addition);
    }

    public boolean isLevelTrailSegment(int begin, int end)
    {
        boolean levelOrNot = true;
        for( int i = begin; i < end; i++)
        {
            if( i > begin && Math.abs(markers.get(i) - markers.get(i-1)) > 10)
            {
                levelOrNot = false;
            }                    
        }
        if( markers.get(begin) == markers.get(end) && levelOrNot == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isDifficult(int begin, int end)
    {
        int totalUphill = 0;
        for(int i = begin; i < end; i++)
        {
            if(i > 0 && markers.get(i) - markers.get(i-1) > 0)
            {
                totalUphill += (markers.get(i) - markers.get(i-1)); 
            }
        }
        if(totalUphill > 100 && !isLevelTrailSegment(begin, end))
        {
            return true;
        }
        else
        {
            return false;
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
