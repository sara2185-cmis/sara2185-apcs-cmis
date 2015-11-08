
public class ClassMethodP3App
{
    public static void main( String[] args )
    {
       
        ClassMethodP3 junior = new ClassMethodP3();
        ClassMethodP3 senior = new ClassMethodP3("Joe ", "Senior", 11, 1606, 4.0, 4.0, 3.5, 4.0, 4.0 );
        System.out.println(senior); 
        System.out.println("\n\n");
        senior.setGPA(4.0, 4.0, 4.0, 4.0, 4.0);
        System.out.println(senior);
        
    }//end method main
}// end class StudentDriver

