import javax.swing.JOptionPane;
public class TryAgain
{
    public static void main (String args[])
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Give me a number"));
        int these[] = new int[n];
        int those[] = new int[n/2];
        for(int i = 0; i < these.length; i++)
        {
            these[i] = ((int)(n*Math.random()));
        }
        for(int i = 0; i < these.length; i++)
        {
            System.out.println(these[i]);
        }
        for(int i = 0; i < these.length; i ++)
        {
            for(int j = these.length-2; j > 0; j++)
            {
                if (these[i] > these[j])
                {
                    those[i] = these[i];
                }
                else if (these[i] == these[j])
                {
                    those[i] = -1;
                }
            }
            System.out.println(those[i]);
        }
    }
}