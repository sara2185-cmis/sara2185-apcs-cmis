
public class ShoesUpdatedApp
{
    public static void main( String[] args )
    {
       
        ShoesUpdated Shoes1 = new ShoesUpdated();
        ShoesUpdated Shoes2 = new ShoesUpdated("Flipflops", "Nike", 10);
        System.out.println( Shoes1);
        Shoes1.setShoesUpdated("Pumps", "Billabong", 5);
       
        System.out.println( Shoes1);
        System.out.println( Shoes2);
    }//end method main
}// end class ShoeDriver
