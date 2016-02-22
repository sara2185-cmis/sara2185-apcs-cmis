
public class Scales extends Piano
{
    int beat;
    
    public Scales(String key, String flatsSharps, String tonality, String articulation, int beat, String type)
    {
        super(key, flatsSharps, tonality, articulation);
        beat = 88;
        String types[] = new String[]{"Scales a third apart", "Scales a sixth apart", "Scales " };
        type = types[(int)(Math.random() *types.length)];
        
 
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