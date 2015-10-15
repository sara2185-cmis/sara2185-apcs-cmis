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
        volume = d * h * w;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        dleft = w *x;
        dback = h * y;
        dbottom = d * z;
        name = "CubiVerse-" + Math.random();
    } // end constructor Cubiverse
    public Cubiverse(int w, int h, int d, String name)
    {
        this.w = w;
        this.h = h;
        this.d = d;
        volume = w * d * h;
        x = 0.50;
        y = 0.50;
        z = 0.50;
        dleft = w *x;
        dback = h * y;
        dbottom = d * z;
        this.name = name;
    } // end constructor Cubiverse
     public Cubiverse(double x, double y, double z, String name)
    {
        w = 1;
        h = 1;
        d = 1;
        this.x = x;
        this.y = y;
        this.z = z;
        volume = w * d * h;
        dleft = w *x;
        dback = h * y;
        dbottom = d * z;
    } // end constructor Cubiverse
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "Name: " + name + "\n" +
        "w: " + w + "\n" +
        "h: " + h + "\n" +
        "d: " + d + "\n" +
        "volume: " + volume + "\n" +
        "x: " + String.format("%.2f", x) + "\n" +
        "y: " + String.format("%.2f", y)+ "\n" +
        "z: " + String.format("%.2f", z) + "\n" +
        "distance from the left: " + String.format("%.2f", dleft) + "\n" +
        "distance from the bottom: " + String.format("%.2f", dbottom) + "\n" +
        "distance from the back: " + String.format ("%.2f", dback);
        return output;
    }

} // end Song