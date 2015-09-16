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
            randomNums[index] = (int) ((Math.random() * 100));
            for( int index1 = 0; index1 < 100; index1 ++)
            {  
                if (randomNums[index] == index1)
                {
                    counter[index1]++;
                }//end if

            } //end for loop    
        } // end for loop
        for( int index = 0; index < 100; index++ ) 
        {
            System.out.print(index + " : ");
           for( int asterick = 0; asterick < counter[index]; asterick++)
           {
             System.out.print("#"); 
            } // end for loop
            System.out.println(" ");
            
        } // end for loop
        
        /*int minimumNum = 0;
        for( int index = 0; index < 100; index++ ) // finding minimum number
        {
            if (index==99)
            {
                if(randomNums[index] < randomNums[index])
                {
                    minimumNum = randomNums[index];
                }// end if statement
            }
            else
            {
                if(randomNums[index] < randomNums[index+1])
                {
                    minimumNum = randomNums[index];
                }// end if statement
            }
            System.out.println(minimumNum);
        } // end for loop
        */
        int sum = 0; 
        int total = 0;
        for( int index = 0; index < randomNums.length; index++ ) // finding minimum number
        {
            total = randomNums[index] + sum;
          
        } // end for loop
       System.out.println(total);
       
    } // end main
} // end HelloWorld
