
public class Scales extends Piano
{
    int beat;
    
    public Scales(String key, String flatsSharps, String articulation, int beat, String type, String tonality)
    {
        super(key, flatsSharps, articulation);
        beat = 88;
        String types[] = new String[]{"Scales a third apart", "Scales a sixth apart", "Scales " };
        type = types[(int)(Math.random() *types.length)];
        String tonalities[] = {"major", "harmonic minor", "melodic minor"};
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