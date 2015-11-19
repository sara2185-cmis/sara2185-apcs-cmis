import java.util.Scanner;

public class StringMethods
{
    public static void main(String[]args)
    {
        System.out.println("Testing");
        Scanner input = new Scanner( System.in);
        String statement = input.nextLine();
        System.out.println( "I typed: " + statement);
        System.out.println("substring:" + statement.substring(2) );
        System.out.println("substring:" + statement.substring(4, 7) );
        System.out.println( "indexOf:" + statement.indexOf("mazing"));
        System.out.println("comparison:" + statement.compareTo("Good") );
         System.out.println("comparison:" + statement.compareTo("Zebra") );
        
        System.out.println("trim:" + statement.trim());
        System.out.println("lowercase:" + statement.toLowerCase());
        System.out.println("uppercase:" + statement.toUpperCase());
    }//end method main
}//end class StringMethods