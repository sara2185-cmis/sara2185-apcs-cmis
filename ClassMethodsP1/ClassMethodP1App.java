
public class ClassMethodP1App
{
        public static void main( String[] args )
        {
           
         
            ClassMethodP1 Song1 = new ClassMethodP1();
            System.out.println( Song1);
            System.out.println("\n\n");
            System.out.println( "Not setting the year released:" + Song1.getYearReleased() );
            Song1.setYearReleased( 1991);
            System.out.println("Setting the year released:" + Song1.getYearReleased() );
           
        }//end method main
}// end class SongDriver