import javax.swing.JOptionPane;
public class Histogram 
{ 

    public static void main ( String args[] )
    {
        String input1 = JOptionPane.showInputDialog( "Enter a number.");
        int num= Integer.parseInt( input1);
        int randomNums[] = new int [num];
        int counter [] = new int [100];
        for( int index = 0; index < randomNums.length; index++ ) // creating random number
        {
            randomNums[index] = (int) ((Math.random() * 100));
            for( int index1 = 0; index1 < randomNums.length; index1 ++)
            {  
                if (randomNums[index] == index1)
                {
                    counter[index1]++;
                }//end if
            } //end for loop    
        } // end for loop
        for( int index = 0; index < randomNums.length; index++ ) // creating random number
        {
            System.out.println(index + " : " + counter[index]);

        } // end for loop
        for( int index = 0; index < randomNums.length; index++ ) // creating random number
        {

            System.out.println(randomNums[index]);

        } // end for loop
    } // end main
} // end HelloWorld
