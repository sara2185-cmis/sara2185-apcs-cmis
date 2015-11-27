public class ClassMethodP5
{
    public static void main(String [] args)
    {
        String school1 = new String("Carleton");
        String school2 = new String("Bowdoin");
        String school3 = new String("Grinnell");

        System.out.println(school1.compareTo(school2));
        System.out.println(school2.compareTo(school1));
        System.out.println(school2.compareTo(school3));
        System.out.println(school3.compareTo(school2));
        System.out.println(school1.compareTo(school3));
        System.out.println(school3.compareTo(school1));

        String school4 = new String("Colby");
        System.out.println(school1.compareTo(school4));

        /*
        a. The method, compareTo, compares the first letter of each school, which displays an integer of the difference of the letters according to the alphabetical order. 
        If school1's letter comes after school 2, the output would be a positive integer. 
        If school1's letter comes before school2, the output would be a negative integer.
        b. If two schools have the same first letter, the method, compareTo(), would then compare the second letter.
         */

    }// end method main
}// end class
