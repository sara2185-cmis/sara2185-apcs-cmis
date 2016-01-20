/**
 * Write a description of class RosterDriver here.
 * 
 * @Sara
 * @January 20th, 2016
 */
public class Roster2Driver
{
    public static void main ( String args[] )
    {
        apComputerScience apComputerScience = new apComputerScience();
        apComputerScience.addStudent(new Student("Hermione", "Granger", 11, 2188, 4.0, 4.0, 4.0, 4.0, 4.0));
        apComputerScience.addStudent(new Student("Harry", "Potter", 11, 2121, 3.0, 3.5, 3.5, 3.0, 3.0));
        apComputerScience.addStudent(new Student("Ron", "Weasley", 12, 1990, 2.0, 2.0, 2.5, 3.0, 2.5));
        
        System.out.println("Period1: \n" + apComputerScience);
        apComputerScience.dropStudent("Weasley");
        System.out.println("\n" + apComputerScience);
    }
    
}
