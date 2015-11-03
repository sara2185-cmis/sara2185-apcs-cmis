
public class ClassMethodP1App
{
        public static void main( String[] args )
        {
           
            ClassMethodP1 Song2 = new ClassMethodP1("Cold Play", "Paradise", 4);
            ClassMethodP1 Song1 = new ClassMethodP1();
            System.out.println( Song1);
            System.out.println( Song2);
            
            System.out.println("\n\n");
            System.out.println( Song1.getYearReleased() );
            Song1.setYearReleased( 1991);
            System.out.println( Song1.getYearReleased() );
           
        }//end method main
}// end class SongDriver