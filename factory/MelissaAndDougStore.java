package factory;
/**
 * This class creates a wooden animal/color puzzle and returns it 
 * @author Michael Cluver
 */
public class MelissaAndDougStore extends ToyStore
{
    public Puzzle createPuzzle(String type)
    {
        if(type.equals("animal"))
            return new WoodAnimalPuzzle();
        else if(type.equals("color"))
            return new WoodColorPuzzle();
        else
            return null;
    }
}
