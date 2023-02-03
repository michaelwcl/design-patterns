package factory;
/**
 * A plastic color Puzzle by Fisher Price
 * @author Michael Cluver
 */
public class PlasticColorPuzzle extends Puzzle
{
    /**
     * Creates a plastic color puzzle
     * Sets its type to plastic and sets its pieces and name
     */
    public PlasticColorPuzzle()
    {
        this.name = "Color Puzzle by Fisher Price";
        this.material = "plastic";

        String[] toAdd = new String[]{"Green Dog", "Orange Dog", "Red Dog", "Blue Dog", "Yellow Dog", "Brown Dog"};
        
        for(String i : toAdd)
        {
            this.pieces.add(i);
        }
    }
}
