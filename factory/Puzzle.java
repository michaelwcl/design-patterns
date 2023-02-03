package factory;

import java.util.ArrayList;
/**
 * Base puzzle type for assembling a string to return later
 * @author Michael Cluver
 */
public class Puzzle 
{
    protected String name;
    protected String material;
    protected ArrayList<String> pieces = new ArrayList<String>();

    /**
     * Assembles a string a puzzle at the same time and returns it
     * @return A assembled string describing the making of a specific puzzle
     */
    public String assemble()
    {
        String ret = "Putting together a " 
            + this.name
            +"\n"
            + "This puzzle is made out of "
            +this.material
            + "\n";

        ret += "Adding the following pieces\n";

        for(String piece : pieces)
        {
            ret += "- " + piece + "\n";
        }

        return ret;

    }

    /**
     * Finishes the process of factory assembly
     * @return A String to conclude the assembled string
     */
    public String boxPuzzle()
    {
        return "Putting the " + this.name + " in a box";
    }
}
