public class Cubiverse
{
    //1. Create instance variables
    double dleft;
    double dbottom;
    double dback;
    int w, h, d;
    double x, y, z;
    int volume;
    String name;

    //2. Write constructor to initialize instance variables
    public Cubiverse()
    {
        w = 1;
        h = 1;
        d = 1;
        volume = 1;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        dleft = 0.50;
        dbottom = 0.50;
        dback = 0.50;
        name = "CubiVerse-" + Math.random();
    } // end constructor Cubiverse
    public Cubiverse(int w, int h, int d, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
        this.dleft = dleft;
        this.dback = dback;
        this.dbottom = dbottom;
        this.name = name;
    } // end constructor Cubiverse
     public Cubiverse(double x, double y, double z, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        this.x = x;
        this.y = y;
        this.z = z;
        this.volume = volume;
        this.dleft = dleft;
        this.dback = dback;
        this.dbottom = dbottom;
    } // end constructor Cubiverse
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "Name: " + name + "\n" +
        "w: " + w + "\n" +
        "h: " + h + "\n" +
        "d: " + w + "\n" +
        "volume: " + volume + "\n" +
        "x: " + x + "\n" +
        "y: " + y + "\n" +
        "z: " + z; //+ "\n" +
        //"distance from the left: " + dleft + "\n" +
        //"distance from the bottom: " + dbottom + "\n" +
        //"distance from the back: " + dback;
        return output;
    }

} // end Song