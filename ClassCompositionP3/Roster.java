
/**
 * Write a description of class Roster here.
 * 
 * @Sara
 * @January 18th, 2016
 */
public class Roster
{
    private Student[] students = new Student[3];

    public Roster()
    {
        students[0] = new Student("Hermione", "Granger", 11, 2188, 4.0, 4.0, 4.0, 4.0, 4.0);
        students[1] = new Student("Harry", "Potter", 11, 2121, 3.0, 3.5, 3.5, 3.0, 3.0);
        students[2] = new Student("Ron", "Weasley", 12, 1990, 2.0, 2.0, 2.5, 3.0, 2.5);
    }

    public String findStudentWithMaxGPA()
    {
        Student maxGPA = new Student();
        for(int i = 0; i < students.length; i ++)
        {
            if(students[i].calcGPA() > maxGPA.calcGPA())
            {
                maxGPA = students[i];
            }
        }
        return maxGPA.fname;
    }

    public String toString()
    {
        String output = new String(); 
        output= "The Student with the highest GPA is... " + findStudentWithMaxGPA();
        return output;
    }
}
