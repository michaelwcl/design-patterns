package factory;
/**
 * A wooden color puzzle by Doug and Melissa
 * @author Michael Cluver
 */
public class WoodColorPuzzle extends Puzzle
{
    /**
     * Creates a wooden color puzzle
     * Also sets its own type and name, while adding all its pieces
     */
    public WoodColorPuzzle()
    {
        this.name = "Color Puzzle by Doug and Melissa";
        this.material = "wood";

        String[] toAdd = new String[]{"Red Fish", "Yellow Fish", "Green Fish", "Purple Fish", 
            "Pink Fish", "Orange Fish", "Brown Fish", "White Fish", "Black Fish"};
        
        for(String i : toAdd)
        {
            this.pieces.add(i);
        }
    }
}
