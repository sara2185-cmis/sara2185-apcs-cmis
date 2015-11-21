
public class Scales
{
    //1. Create instance variables
    private String key;
    private String flatsSharps;
    private String tonality;
    private String articulation;
    //2. Write constructor to initialize instance variables
    public Scales(String key, String flatsSharps, String tonality, String articulation)
    {
        this.key = key;
        this.flatsSharps = flatsSharps;
        this.tonality = tonality;
        this.articulation = articulation;
    } // end constructor Song
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = key + flatsSharps + " " + tonality + " " + articulation;
        return output;
    }

} // end Card