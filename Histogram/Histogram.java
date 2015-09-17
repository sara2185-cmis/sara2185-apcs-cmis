import javax.swing.JOptionPane;
public class Histogram 
{ 
    public static void main ( String args[] )
    {
        String input1 = JOptionPane.showInputDialog( "Enter a number.");
        int num= Integer.parseInt( input1);
        int randomNums[] = new int [num];
        int counter [] = new int [100];
        for( int index = 0; index < randomNums.length; index++ ) 
        {
            randomNums[index] = (int)((Math.random() * 100)); // producing random numbers
            for( int index1 = 0; index1 < 100; index1 ++)
            {  
                if (randomNums[index] == index1)
                {
                    counter[index1]++;
                }//end if statement
            } //end for loop    
        } // end for loop
        for( int index = 0; index < 100; index++ )// producing number of hashtag according to counts
        {
            System.out.print(index + " : ");
            for( int hashtag = 0; hashtag < counter[index]; hashtag++)
            {
                System.out.print("#"); 
            } // end for loop
            System.out.println(" ");
        } // end for loop

        int minimumNum = 100;
        for( int index = 0; index < randomNums.length; index++ ) // finding minimum number
        {
            if(randomNums[index] < minimumNum)
            {
                minimumNum = randomNums[index];
            }// end if statement
        } // end for loop
        System.out.println("MIN: " + minimumNum);
        
        int maximumNum = 0;
        for( int index = 0; index < randomNums.length; index++ ) // finding maximum number
        {
            if(randomNums[index] > maximumNum)
            {
                maximumNum = randomNums[index];
            }// end if statement
        } // end for loop
        System.out.println("MAX: " + maximumNum);

        int sum = 0; 
        for( int index = 0; index < randomNums.length; index++ ) // finding the sum of all random numbers
        {
            sum = randomNums[index] + sum ;
        } // end for loop
        System.out.println("SUM: " + sum);

        double average = 0; // finding the average of all random numbers
        average = (double)(sum) / randomNums.length ;
        System.out.println("AVG: " + average);
        
        int mostOc = 0;
        for( int index = 0; index < counter.length; index++ ) // finding the random number with most occurances
        {
            if(counter[index] >= mostOc)
            {
                mostOc = index;
               
            }// end if statement
        } // end for loop
        System.out.println("MST: " + mostOc);
    } // end main
} // end Histogram
