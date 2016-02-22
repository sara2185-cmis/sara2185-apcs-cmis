
/**
 * @Sara
 * @Feb 17th, 2016
 */

public class Arpeggios extends Piano
{
    int beat;
    public Arpeggios( String key, String flatsSharps, String tonality, String articulation)
    {
        super(key, flatsSharps, tonality, articulation);
        beat = 88;
 
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

