package adapter;

/**
 * A class to convert a littlemedia to match the format of a media object
 * @author Michael Cluver
 */

import java.sql.Date;
import java.util.ArrayList;

public class MediaAdapter implements Media{
    private String title;
    private String description;
    private Author author;
    private ArrayList<Review> reviews;

    /**
     * This constructor takes a littleMedial and reformats it to be a media
     * This is done by extracting the title, author and reviews from the inputted littleMedia
     * In the case of the reviews, each review individually split apart using split() to obtain the content within
     * The review date also has to be reformatted.
     * @param littleMedia The LittleMedia to be convereted 
     */
    public MediaAdapter(LittleMedia littleMedia){
        this.title = littleMedia.getTitle();
        this.description = littleMedia.getDescription();
        reviews = new ArrayList<Review>();
        
        String[] authorName = littleMedia.getAuthor().split(" ");
        this.author = new Author(authorName[0], authorName[1]);

        for(String x: littleMedia.getReviews()){
            String firstName;
            String lastName;
            double rating;
            java.util.Date date;
            String comment;

            rating = Double.parseDouble((x.split(" stars - "))[0]);
            comment = (x.split(" stars - "))[1].split(" by ")[0];
            firstName = (x.split(" stars - "))[1].split(" by ")[1].split(" - ")[0].split(" ")[0];
            lastName = (x.split(" stars - "))[1].split(" by ")[1].split(" - ")[0].split(" ")[1];

            String splitNewDate = (((x.split(" stars - "))[1].split(" by "))[1]).split(" - ")[1].replace('/', '-');
            String newDate = splitNewDate.substring(6) + "-" + splitNewDate.substring(0, 5);

            date = Library.parseDate(newDate);

            this.reviews.add(new Review(firstName, lastName, date, rating, comment));
        }
        
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    /**
     * This adds a review to the arrayList of reviews of this media
     */
    public void addReview(String firstName, String lastName, java.util.Date date, double rating, String comment) {
        reviews.add(new Review(firstName, lastName, date, rating, comment));
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }
}