package factory;
/**
 * A wooden animal puzzle by Doug and Melissa
 * @author Michael Cluver
 */
public class WoodAnimalPuzzle extends Puzzle
{
    /**
     * Creates a wooden animal puzzle
     * Also sets name, material and its specific pieces
     */
    public WoodAnimalPuzzle()
    {
        this.name = "Animal Puzzle by Melissa and Doug";
        this.material = "wood";

        String[] toAdd = new String[]{"Horse", "Sheep", "Dog", "Cat", "Cow", "Chicken"};
        
        for(String i : toAdd)
        {
            this.pieces.add(i);
        }
    }
}
