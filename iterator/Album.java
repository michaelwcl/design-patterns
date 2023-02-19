package iterator;
/**
 * A collection of Songs, held in an Album
 * @author Michael Cluver
 */
public class Album 
{
    private Song[] songs;
    private int count;
    private String name;
    /**
     * Creates an album with no contents
     * @param name A name for the album (like "Nevermind")
     */
    public Album(String name)
    {
        songs = new Song[20];
        this.name = name;
        this.count = 0;
    }
    /**
     * Adds a song to the array of songs in the album
     * @param name A name for the song (like "In Bloom")
     * @param artist An artist for the song (like "Nirvana")
     * @param length A length for the song (like 4.18 minutes)
     * @param genre A genre for the song (like "Grunge")
     * @return true if the song added successfully, false if there was no space left
     */
    public boolean addSong(String name, String artist, double length, Genre genre)
    {

        Song toAdd = new Song(name, artist, length, genre);


        if(count > 19)
        {
            return false;
        }
        else 
        {
            songs[this.count] = toAdd;
            this.count++;
            return true;
        }

    }
    /**
     * Instantiates an AlbumIterator to "handle" the album
     * @return An instance of AlbumIterator
     */
    public AlbumIterator createIterator()
    {
        return new AlbumIterator(songs);
    }
    /**
     * Returns the name of the albume
     * @return the name of this albume
     */
    public String getName()
    {
        return this.name;
    }
}

