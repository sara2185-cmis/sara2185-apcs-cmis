public class ClassMethodP4
{
    //1. Create instance variables
    private String fname;
    private String lname;
    private int grade;
    private int studentNumber;
    private double grades[] = new double [5];

    //2. Write constructor to initialize instance variables
    public ClassMethodP4()
    {
        lname = "Tantiviramanond";
        fname = "Anchalee";
        grade = 12;
        studentNumber = 2185;
        for(int i = 0; i < grades.length; i++)
        {
            grades[i] = 0;
        }//end for loop
    } // end constructor ClassMethodP3
    public void setGPA(double english, double math, double science, double fineArts, double socialScience)
    {
        this.grades[0]= english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience; 

    }// end method setGPA
    public double calcGPA()
    {
        double total = 0.0;
        for(int i = 0; i < grades.length; i++)
        {
            total += grades[i];
        }// end for statement
        total /= grades.length;
        return total;
    }// end method calcGPA
    public String getGPA()
    {
        if (this.calcGPA() >= 4.00)
        {
            return "A";
        }// end if
        else if (this.calcGPA() > 3.00 && this.calcGPA() <= 4.00)
        {
            return "B";
        }// end else if
        else if (this.calcGPA() > 2.00 && this.calcGPA() <= 3.00)
        {
            return "C";
        }// end else if
        else if (this.calcGPA() > 1.00 && this.calcGPA() <= 2.00)
        {
            return "D";
        }// end else if
        else 
        {
            return "F";
        }// end else
    }//end get GPA
    public ClassMethodP4(String fname, String lname, int grade, int studentNumber, double english, double math, double science, double fineArts, double socialScience)
    {
        this.lname = lname;
        this.fname = fname;
        this.grade = grade;
        this.studentNumber = studentNumber;
        this.grades[0]= english;
        this.grades[1] = math;
        this.grades[2] = science;
        this.grades[3] = fineArts;
        this.grades[4] = socialScience; 
    } // end constructor Student
    //3. toString()
    public String toString()
    {
        return String.format("The student's name is %s %s \n" +
        "Grade level: %d \n" +
        "Student number: %d\n" +
        "Average gpa: %.02f\n" +
        "Grade: %s\n" +
        "%.02f %.02f %.02f %.02f %.02f", fname, lname, grade, studentNumber, calcGPA(), getGPA(), grades[0], grades[1], grades[2], grades[3], grades[4]);
        /*
         * String output = new String();
        output = "The student's name is " + fname + lname + "\n" +
        "Grade level: " + grade + "\n" +
        " Student number: " + studentNumber + "\n" +
        "Average gpa: " + calcGPA() + "\n" +
        "Grade: " + getGPA() + "\n" +
        grades[0] + " " + grades[1] + " " + grades[2] + " " + grades[3] + " " + grades[4];
        return output;
         */
    }
}