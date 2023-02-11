package iterator;
/**
 * An individual song in an albume
 * @author Michael Cluver
 */
public class Song 
{
    private String name;
    private String artist;
    private double length;
    public Genre genre;

    /**
     * Creates an individual song 
     * @param name A name for the song
     * @param artist An artist for the song
     * @param length A length for the song
     * @param genre A genre for the song
     */
    public Song(String name, String artist, double length, Genre genre)
    {
        this.name = name;
        this.artist = artist;
        this.length = length;
        this.genre = genre;
    }
    /**
     * Returns the parameters of the song in a specific format
     */
    public String toString()
    {
        String stringGenre = "";

        for(int i = 0; i <this.genre.name().length(); i++)
        {
            if(this.genre.name().charAt(i) == '_')
            {
                stringGenre += " ";
            }
            else
            {
                stringGenre += this.genre.name().charAt(i);
            }
        }

        return this.name + " by " + this.artist + " category: " + stringGenre + " length: " + this.length;
    }
}
