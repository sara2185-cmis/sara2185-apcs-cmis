
public class Student
{
    //1. Create instance variables
    private String fname;
    private String lname;
    private int grade;
    private int studentNumber;
    
    //2. Write constructor to initialize instance variables
    public Student()
    {
       lname = "Tantiviramanond";
       fname = "Anchalee";
       grade = 12;
       studentNumber = 2185;
    } // end constructor Student
    public Student(String fname, String lname, int grade, int studentNumber)
    {
       this.lname = lname;
       this.fname = fname;
       this.grade = grade;
       this.studentNumber = studentNumber;
    } // end constructor Student
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The student's first name is " + fname + ", and his/her last name is " + lname + ". His/her grade is " + grade + " and his/her student number is " + studentNumber + ".";
        return output;
    }

} // end Student