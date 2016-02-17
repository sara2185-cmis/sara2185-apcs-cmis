
public class Scales
{
    //1. Create instance variables
    private String type;
    private String key;
    private String flatsSharps;
    private String tonality;
    private String articulation;
    //2. Write constructor to initialize instance variables
    public Scales(String type, String key, String flatsSharps, String tonality, String articulation)
    {
        this.type = type;
        this.key = key;
        this.flatsSharps = flatsSharps;
        this.tonality = tonality;
        this.articulation = articulation;
    } // end constructor Song
    public String beat()
    {
        if( type.equals("Scales a third apart"))
        {
            return "Beat = 92";
        }
        else if(type.equals("Scales a sixth apart"))
        {
            return "Beat = 88";
        }
        else
        {
            return "Beat = 96";
        }
    }
    
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = type + " in " + key + flatsSharps + " " + tonality + " " + articulation + "\n " + beat();
        return output;
    }
    

} // end Card