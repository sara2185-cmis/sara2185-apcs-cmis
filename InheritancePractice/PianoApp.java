
/**
 * Randomly chooses scales/arpeggios
 * 
 * @Sara
 * @Feb 17th, 2016
 */
import javax.swing.JOptionPane;
import java.util.ArrayList;
public class PianoApp
{

    public static void main(String[] args )
    {
        int scalesInput = Integer.parseInt(JOptionPane.showInputDialog("How many scales would you like to practice today?"));
        int arpeggiosInput = Integer.parseInt(JOptionPane.showInputDialog("How many arpeggios would you like to practice today?"));
        ArrayList<Piano> thisPiano = new ArrayList<Piano>();
        Scales thisScales[] = new Scales[scalesInput];
        Arpeggios thisArpeggios[] = new Arpeggios[arpeggiosInput];
        String key[] = {"C", "D", "E", "F", "G", "A", "B"};
        String flatsSharps[] = {"\u266D", "#", " "};
        String articulation[] = {"staccato", "legato"};
        String type = "";
        String tonality = "";
        int beat = 0;

        for(int i = 0; i < scalesInput; i++)
        {
            thisScales[i] = new Scales(key[(int)(Math.random() *key.length)], flatsSharps[(int)(Math.random() *flatsSharps.length)], articulation[(int)(Math.random() * articulation.length)], beat, type, tonality);
            thisPiano.add(thisScales[i]);
        }

        for(int i = 0; i < arpeggiosInput; i++)
        {
            thisArpeggios[i]  = new Arpeggios(key[(int)(Math.random() *key.length)], flatsSharps[(int)(Math.random() *flatsSharps.length)], articulation[(int)(Math.random() * articulation.length)], beat, tonality);
            thisPiano.add(thisArpeggios[i]);
        }
        
        for( int i = 0; i < scalesInput + arpeggiosInput; i++)
        {
            System.out.println(thisPiano.get(i));
        }
       
    }
}
