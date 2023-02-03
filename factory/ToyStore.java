package factory;
/**
 * A base class toy store that has methods to assemble a specific brand of puzzle
 * @author Michael Cluver
 */
public abstract class ToyStore 
{
    public abstract Puzzle createPuzzle(String type);

    /**
     * Orders a puzzle to be made and boxed
     * @param type is either "animal" or "puzzle" and will be passed to the puzzle to be made
     * @return A assembled string to be printed
     */
    public String orderPuzzle(String type)
    {
        Puzzle outputPuzzle = createPuzzle(type);

        String ret = outputPuzzle.assemble() + outputPuzzle.boxPuzzle();

        return ret;
    }
}
