
/**
 * Write a description of class ClassCompositionP4 here.
 * 
 * @Sara
 * @January 20th, 2016
 */
import java.util.ArrayList;
public class ClassCompositionP4
{
    public static void main ( String args[] )
    {
        ArrayList<String> myFamily = new ArrayList<String>();
        myFamily.add("Dad: Dhiravadhana Tantiviramanond");
        myFamily.add("Mom: Winifred Charlotte O'Dell Tan");
        myFamily.add("Brother: Dharit Hobbs Tantiviramanond");
        myFamily.add("Sister: Lydia O'Dell Tantiviramanond");
        myFamily.add("Me: Anchalee Lincoln Tantiviramanond");

        System.out.print("There are " + myFamily.size() + " members in my family. \n\n");
        System.out.print("The members in my family are...\n");
        for(int i = 0; i < myFamily.size(); i++)
        {
            System.out.println(myFamily.get(i));
        }
        System.out.println("\n And here they are again... ") ;
        for(String member: myFamily)
        {
            System.out.println(member);
        }

    }
}
