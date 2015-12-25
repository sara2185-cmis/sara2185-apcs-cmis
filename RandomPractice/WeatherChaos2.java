import javax.swing.JOptionPane;
public class WeatherChaos2
{
    public static void main ( String args[] )
    {
        int input = Integer.parseInt(JOptionPane.showInputDialog("How many days?"));
        int temp[] = new int[input];
        int day = 0;
        String description = "";
        int swing = 0;
        int min = 99; 
        int max = -100; 
        double average = 0;
        int sum = 0;
        int maxSwing = 0;
        if(input > 0 && input <= 31)
        {
            for(int i = 0; i < temp.length; i++)
            {
                temp[i] = (int) (Math.random() * 200) - 100;
            }
            System.out.println("Day\tTemp\tSwing\tDescription");
            for(int i = 0; i < temp.length; i++)
            {
                day = i + 1;
                if(i > 1)
                {
                    swing = Math.abs(temp[i]-temp[i-1]);
                }
                if(temp[i] < 0)
                {
                    description = "freezing";
                }
                else if(temp[i] > 0 && temp[i] < 15)
                {
                    description = "chilly";
                }
                else if(temp[i] > 15 && temp[i] < 30)
                {
                    description = "comfortable";
                }
                else if(temp[i] > 30 && temp[i] < 40)
                {
                    description = "hot";
                }
                else if(temp[i] > 40)
                {
                    description = "AAAAAAUUUGHHH!";
                }
                if(temp[i] < min)
                {
                    min = temp[i];
                }
                if(temp[i] > max)
                {
                    max = temp[i];
                } 
                if(swing > maxSwing)
                {
                    maxSwing = swing;
                } 
                sum += temp[i];
                average = sum/input;
                System.out.println(day + "\t" + temp[i] + "\t" + swing + "\t" + description);
            }
            System.out.println("MIN: " + min);
            System.out.println("MAX: " + max);
            System.out.println("AVG: " + average);
            System.out.println("MAXSWING: " + maxSwing);
        }
        else 
        {
            System.out.print("That is not a valid number of days");
        }
    }
}