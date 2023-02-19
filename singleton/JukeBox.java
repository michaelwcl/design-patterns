package singleton;
/**
 * A JukeBox class that plays through a list of by-demand songs
 * @author Michael Cluver
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class JukeBox 
{
    private static JukeBox jukeBox;
    private ArrayList<Song> songs;
    private Queue<String> songQueue;
    /**
     * Creates a JukeBox
     * Also instantiates a queue and reads the songs
     */
    private JukeBox()
    {
        this.songs = DataLoader.getSongs();
        songQueue = new LinkedList<String>();
    }
    /**
     * Returns a instace of a JukeBox, and instantiates one if need be
     * @return A JukeBox for the driver
     */
    public static JukeBox getInstance()
    {
        if(jukeBox == null)
        {
            jukeBox = new JukeBox();
        }
        return jukeBox;
    }
    /**
     * Iterates the queue
     * @return A string representing a song that is playing
     */
    public String playNextSong()
    {
        if(!songQueue.isEmpty())
        {
            return "Let's jam to " + songQueue.poll();
        }
        else
        {
            return "You need to add more songs to the list";
        }
    }
    /**
     * A way for the user to attempt to queue a song
     * @param title The name of the requested song (please stop queueing Taylor Swift songs)
     * @return A string confirmation of the song being added (or not)
     */
    public String requestSong(String title)
    {
        for(Song i: songs)
        {
            if(i.getTitle().equals(title))
            {
                this.songQueue.add(i.toString());
                return title + " is now number " + (songQueue.size()) + " on the list";
            }
        }

        return "Sorry we do not have the song " + title;
    }
    /**
     * Checks to see if the queue is empty
     * @return T/F depending on the queue
     */
    public boolean hasMoreSongs()
    {
        if(songQueue.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
