
/**
 * @Sara
 * @Feb 17th, 2016
 */

public class Arpeggios extends Piano
{
    int beat;
    public Arpeggios( String key, String flatsSharps, String articulation, String tonality)
    {
        super(key, flatsSharps, articulation);
        beat = 88;
        String[] tonalities = {"major", "minor"}; 
        tonality = tonalities[(int)(Math.random() *tonalities.length)];
    }
    
    public int getBeat()
    {
        return beat;
    }

    public String toString()
    {
        String output = new String();
        output = super.toString();
        return output;
    }
} // end 

