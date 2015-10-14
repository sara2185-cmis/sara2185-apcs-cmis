
public class CubiverseApp
{
    public static void main ( String[] argv )
    {
        int numCubiverses = 5;
        Cubiverse[] zero = new Cubiverse[numCubiverses];//so elements in array = 5
       
        Cubiverse[] threeA = new Cubiverse[numCubiverses];
        Cubiverse[] threeB = new Cubiverse[numCubiverses];
        double x, y, z;
        int w, h, d;
        String name;
        for ( int i = 0; i < numCubiverses; i++ )
        {
          
            zero[i] = new Cubiverse();
            w = (int)(Math.random() * i * 10) + 1;
            h = (int)(Math.random() * i * 10) + 1;
            d = (int)(Math.random() * i * 10) + 1;
            name = "CubiVerse-"+i * Math.random();
            threeA[i] = new Cubiverse( w, h, d, name);
            x = Math.random();
            y = Math.random();
            z = Math.random();
            name = "CubiVerse-"+i * Math.random();
            threeB[i] = new Cubiverse(x, y, z, name);
        }
        
        System.out.println("Zero Arguments\n==============");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(zero[i]);
        }
        System.out.println("Three A Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            
            System.out.println(threeA[i]);
        }
        System.out.println("Three B Arguments\n=================");
        for ( int i = 0; i < numCubiverses; i++ )
        {
            System.out.println(threeB[i]);
        }     
    }
}