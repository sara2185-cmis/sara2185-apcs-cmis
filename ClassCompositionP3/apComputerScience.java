
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

    public void addStudent (Student newStudent)
    {
        students.add(newStudent);
    }

    public void dropStudent (String lastName)
    {
        for(int i = 0; i < students.size(); i ++)
        {
            if(students.get(i).lname.equals(lastName))
            {
                students.remove(students.get(i));
            }
        }
    }

    public String findStudentWithMaxGPA()
    {
        Student maxGPA = new Student();
        for(int i = 0; i < students.size(); i ++)
        {
            if( students.get(i).calcGPA() > maxGPA.calcGPA())
            {
                maxGPA = students.get(i);
            }
        }
        return maxGPA.fname;
    }

    public String toString()
    {
        String output = new String();
        for(int i = 0; i < students.size(); i++)
        {
            output += students.get(i) + "\n";
        }
        output += "\nThe Student with the highest GPA is... " + findStudentWithMaxGPA();
        return output;
    }
}
