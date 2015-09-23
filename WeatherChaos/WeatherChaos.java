import javax.swing.JOptionPane;

public class WeatherChaos { 

    public static void main ( String args[] )
    {

        int input = Integer.parseInt(JOptionPane.showInputDialog( "Enter a number."));
        int [] nums = new int [input];
        int temp = 0;
        String output;
        String description = "";
        int minimumNum = 99;
        int maximumNum = 0;
        int sum = 0; 
        double average = 0; // finding the average of all random numbers

        if(input > 32 || input <= 0)
        {
            System.out.print("That's not a valid number of days");

        }

        for ( int i = 0; i < input; i++ )
        {
            temp = (int)((Math.random() *200)-100);
            nums[i] = temp;
            if(input > 32)
            {
                System.out.print("That's not a valid number of days");
            }
            if(input <= 0)
            {
                System.out.print("That's not a valid number of days");
            }

        }// end for loop
        System.out.println("days" + "\t" + "temp" + "\t" + "swing" + "\t" + "description");
        for ( int i = 0; i < input; i++ )
        {
            temp = (int)((Math.random() *200)-100);
            nums[i] = temp;
            int days = i+1;
            int swing = 1;//Math.abs(nums[i+1]-nums[i]);
            output = "";
            if(temp < 0)
            {
                description = "freezing";
            }
            if(temp > 0 && temp < 15)
            {
                description = "chilly";
            }
            if(temp > 15 && temp < 30)
            {
                description = "comfortable";
            }
            if(temp > 31 && temp < 40)
            {
                description = "hot";
            }
            if(temp > 40)
            {
                description = "AAAAUUGGH!!!!";
            }
            output += description;

            System.out.println(days + "\t" + temp + "\t" + swing + "\t" + output);

           
            if(temp < minimumNum)
            {
                minimumNum = temp;
            }// end if statement
            if(temp > maximumNum)
            {
                maximumNum = temp;
            }// end if statement
            sum = temp + sum ;
            average = (double)(sum) / nums.length ;

               
           
            

           
        }// end for loop

        System.out.println("The minimum temperature was " + minimumNum + " on day "  );
        System.out.println("The maximum temperature was " + maximumNum + " on day "  );
        System.out.println("The average temperature was  " + average);

    } // end main
} // end FundamentalsP8
