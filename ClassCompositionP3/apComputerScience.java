
/**
 * Write a description of class Roster here.
 * 
 * @Sara
 * @January 19th, 2016
 */
import java.util.ArrayList;
public class apComputerScience
{
    private ArrayList<Student> students = new ArrayList<Student>();

    public apComputerScience()
    {
        students.add(new Student("Hermione", "Granger", 11, 2188, 4.0, 4.0, 4.0, 4.0, 4.0));
        students.add(new Student("Harry", "Potter", 11, 2121, 3.0, 3.5, 3.5, 3.0, 3.0));
        students.add(new Student("Ron", "Weasley", 12, 1990, 2.0, 2.0, 2.5, 3.0, 2.5));
    }
    
    public void addStudent (Student newStudent)
    {
        students.add(newStudent);
    }
    public void dropSudent (String lastName)
    {
        students.add(newStudent);
    }

    public String findStudentWithMaxGPA()
    {
        Student maxGPA = new Student();
        for(int i = 0; i < students.size(); i ++)
        {
            if(students.calcGPA() > maxGPA.calcGPA())
            {
                maxGPA = students[i];
            }
        }
        return maxGPA.fname;
    }

    public String toString()
    {
        String output = new String();
        output = "The Student with the highest GPA is... " + findStudentWithMaxGPA();
        return output;
    }
}
