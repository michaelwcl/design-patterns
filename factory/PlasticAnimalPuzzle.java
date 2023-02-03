package factory;
/**
 * This class is a Wooden Animal puzzle by Doug and Melissa
 * @author Michael Cluver
 */
public class PlasticAnimalPuzzle extends Puzzle
{
    /**
     * Creates a specific type of puzzle, and delcares its name as wood and material as plastic
     * Also sets its pieces to the required pieces
     */
    public PlasticAnimalPuzzle()
    {
        this.name = "Animal Puzzle by Fisher Price";
        this.material = "plastic";

        String[] toAdd = new String[]{"Fox", "Elephant", "Giraffe", "Owl", "Monkey"};
        
        for(String i : toAdd)
        {
            this.pieces.add(i);
        }
    }
}
