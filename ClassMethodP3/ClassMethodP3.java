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
    public ClassMethodP3(String fname, String lname, int grade, int studentNumber, double english, double math, double science, double fineArts, double socialScience)
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
        String output = new String();
        output = "The student's name is " + fname + lname + ". \n" +
        "His/her grade is " + grade + ". \n" +
        " His/her student number is " + studentNumber + ". \n" +
        "His/her average gpa is " + calcGPA();
        return output;
    }
}
