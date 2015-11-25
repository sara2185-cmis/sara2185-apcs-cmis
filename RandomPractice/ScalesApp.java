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
       String type[] = {"Scales a third apart", "Scales a sixth apart", "Scales " };
       
       for(int i = 0; i < inputLength; i++)
       {
            thisScales[i] = new Scales(type[(int)(Math.random() *type.length)], key[(int)(Math.random() *key.length)], flatsSharps[(int)(Math.random() *flatsSharps.length)], tonality[(int)(Math.random() * tonality.length)], articulation[(int)(Math.random() * articulation.length)]);
            System.out.println(thisScales[i]);
        }
       
    }
    
}
