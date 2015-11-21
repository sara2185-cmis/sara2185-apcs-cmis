import javax.swing.JOptionPane;


public class ScalesApp
{
    
   public static void main(String[] args )
   {
       String input = JOptionPane.showInputDialog("How many scales would you like to practice today?");
       int inputLength = Integer.parseInt(input);
       Scales thisScales[] = new Scales[inputLength];
       String key[] = {"C", "D", "E", "F", "G", "A", "B"};
       String flatsSharps[] = {"\u266D", "#", " "};
       String tonality[] = {"major", "harmonic minor", "melodic minor"};
       String articulation[] = {"staccato", "legato"};
       
       for(int i = 0; i < inputLength; i++)
       {
            thisScales[i] = new Scales(key[(int)(Math.random() *7)], flatsSharps[(int)(Math.random() *3)], tonality[(int)(Math.random() * 3)], articulation[(int)(Math.random() * 2)]);
            System.out.println(thisScales[i]);
        }
       
    }
    
}
