
public class Piano
{
    
    private String key;
    private String flatsSharps;
    private String tonality;
    private String articulation;
   
   public Piano(String type, String key, String flatsSharps, String tonality, String articulation)
    {
        this.key = key;
        this.flatsSharps = flatsSharps;
        this.tonality = tonality;
        this.articulation = articulation;
    } // end constructor Song

   
   
    public String toString()
    {
        String output = new String();
        output = key + flatsSharps + " " + tonality + " " + articulation;
        return output;
    }
}
