
/**
 * @Sara
 * @Feb 17th, 2016
 */

public class Arpeggios extends Piano
{
    int beat;
    private String key;
    private String flatsSharps;
    private String tonality;
    private String articulation;
    private String type;
    public Arpeggios( String key, String flatsSharps, String articulation, int beat, String tonality)
    {
        super(key, flatsSharps, articulation);
        beat = 86;
        String[] tonalities = new String[]{"major", "minor"}; 
        tonality = tonalities[(int)(Math.random() *tonalities.length)];
    }
    
    public int getBeat()
    {
        return beat;
    }

    public String toString()
    {
        String output = new String();
        output = super.toString() + " " + getBeat();
        return output;
    }
} // end 

