package iterator;
import java.util.Iterator;
/**
 * A class to iterate over Songs in a Album
 * @author Michael Cluver
 */

public class AlbumIterator implements Iterator
{
    private Song[] songs;
    private int position;
    
    /**
     * Creates an AlbumIterator with an album's contents
     * @param songs a set of songs that represent an album
     */
    public AlbumIterator(Song[] songs)
    {
        this.songs = songs;
    }

    /**
     * Checks to see if there is another song next in an album
     */
    public boolean hasNext()
    {
        if(songs[position + 1] == null)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    /**
     * Returns a song representing the next Song in an album
     * Iterates the position (playhead?) too, however does nothing if there is no next song
     */
    public Song next()
    {
        if(hasNext())
        {
            position++;
            return songs[position];
        }
        else
        {
            return null;
        }
    }
}
