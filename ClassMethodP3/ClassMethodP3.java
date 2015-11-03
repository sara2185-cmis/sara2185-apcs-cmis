public class ClassMethodP3
{
    //1. Create instance variables
    private String fname;
    private String lname;
    private int grade;
    private int studentNumber;
    private double grades[] = new double [5];
    
    //2. Write constructor to initialize instance variables
    public ClassMethodP3()
    {
       lname = "Tantiviramanond";
       fname = "Anchalee";
       grade = 12;
       studentNumber = 2185;
       for(double i = 0.0; i < grades.length; i++)
        {
            grades[i] = 0.0;
        }//end for loop
    } // end constructor Student
    public ClassMethodP3(String fname, String lname, int grade, int studentNumber)
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
}
