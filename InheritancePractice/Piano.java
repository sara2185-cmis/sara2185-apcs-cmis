
public class Piano
{
    private String key;
    private String flatsSharps;
    private String tonality;
    private String articulation;
    private String type;


    public Piano(String key, String flatsSharps, String articulation)
    {
        this.key = key;
        this.flatsSharps = flatsSharps;
        this.articulation = articulation;

    } 

    public String getType()
    {
        return type;
    }

    
    public String toString()
    {
        String output = new String();
        output = key + flatsSharps + " " + tonality + " " + articulation ;
        return output;
    }
}
