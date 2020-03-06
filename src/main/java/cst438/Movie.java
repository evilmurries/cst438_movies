package cst438;

import javax.validation.constraints.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

/*
 * One object of class Movie represents a motion picture film.
 */
@Entity
public class Movie
{

   @Id
   @GeneratedValue
   private long id;
   
   @NotNull
   @Size(min=3, max=25)
   private String title;
   
   @NotNull
   @Size(min=1, max=25)
   private String rating;
 
   @NotNull
   @Size(min=3, max=25)
   private String reviewer;
   
   private String timeStamp;
   
   /*
    * Default constructor method for the Movie.
    */
   public Movie() {
      title = null;
      rating = null;
      reviewer = null;
      timeStamp = null;
   }
   
   /*
    * Constructor method for the Movie.
    */
   public Movie(long id, String title, String rating, String reviewer) {
      //super();
      this.id = id;
      this.title = title;
      this.reviewer = reviewer;
      this.rating = rating;
      this.timeStamp = null;
   }
   
   /*
    * This method receives a long integer and sets it as the id for 
    * the Movie.
    */
   public void setId(long newId) {
      this.id = newId;
   }
   
   /*
    * This method returns the Id for the Movie.
    */
   public long getId() {
      return this.id;
   }
   
   /*
    * This method returns the first name string of the Movie.
    */
   public String getTitle() {
      return this.title;
   }
   
   /*
    * This method receives a title as a string and sets it for
    * the Movie.
    */
   public void setTitle(String newTitle) {
      this.title = newTitle;
   }
   
   /*
    * This method returns the integer rating for the Movie.
    */
   public String getRating() {
      return this.rating;
   }
   
   /*
    * This method receives an integer rating and sets it for
    * the Movie.
    */
   public void setRating(String newRating) {
      this.rating = newRating;
   }
   
   /*
    * This method returns the reviewer for the Movie.
    */
   public String getReviewer() {
      return this.reviewer;
   }
   
   /*
    * This method receives a name as a string and sets it as reviewer for
    * the Movie.
    */
   public void setReviewer(String name) {
      this.reviewer = name;
   }
   
   /*
    * This method returns the time stamp for the Movie.
    */
   public String getTimeStamp() {
      return this.timeStamp;
   }
   
   /*
    * This method receives a time stamp as a string and stores it for
    * the Movie.
    */
   public void setTimeStamp(String time) {
      this.timeStamp = time;
   }
   
}