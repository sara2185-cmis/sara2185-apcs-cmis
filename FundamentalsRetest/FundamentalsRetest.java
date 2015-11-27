import javax.swing.JOptionPane;

public class FundamentalsRetest { 

    public static void main ( String args[] )
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
        int these[] = new int[n];
        int those[] = new int[n/2];
        int terminator = n/2 +2;
        String output = "";
        String other = "";

        for(int i = 0; i < n; i++)
        {
            these[i] = (int)(Math.random() * n);
        }
        for(int i = 0; i < n; i++)
        {
            System.out.println(these[i]);
        }
        for(int i = 0; i < terminator; i++)
        {
            if(these[i] > these[n-1])
            {
                those[i] = these[i];
                for(int j = 0; j < these[i]; j++)
                {
                    output = "<";
                }
                while(these[i] < n)
                {
                    other = ">";
                    these[i]++;
                }
            }
            else if(these[i] < these[n-1])
            {
                those[i] = these[n-1];
                for(int j = 0; j < these[n-1]; j++)
                {
                    output = "<";
                }
                while(these[i] < n-1)
                {
                    other = ">";
                    these[i]++;
                }
            }
            else if(these[i] == these[n-1])
            {
                those[i] = -1;
            }
            n--;

            System.out.println(i + ":" + those[i] + output + other);
        }

    } // end main
} // end HelloWorld
