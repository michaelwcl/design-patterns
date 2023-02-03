package factory;
/**
 * This class will create a plastic animal/color puzzle and then return it 
 * @author Michael Cluver
 */
public class FisherPriceStore extends ToyStore
{
    public Puzzle createPuzzle(String type)
    {
        if(type.equals("animal"))
            return new PlasticAnimalPuzzle();
        else if (type.equals("color"))
            return new PlasticColorPuzzle();
        else
            return null;
    } 
}
