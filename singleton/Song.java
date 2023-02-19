package singleton;
/**
 * A song class that represents a song using a song and a title
 * @author Michael Cluver
 */
public class Song 
{
    private String title;
    private String artist;
    /**
     * Creates a song
     * @param title A string to hold the name of the song
     * @param artist A string to hold the artist of the song
     */
    public Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }
    /**
     * A getter
     * @return The title of the song
     */
    public String getTitle()
    {
        return this.title;
    }
    /**
     * Returns a string representation of the song
     */
    public String toString()
    {
        return title + " by " + artist;
    }
}
