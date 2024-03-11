/*
Kadin Henningham
COMP167 003
Feburary 25, 2024
Makes a new book object that is then transferred to BookDatabase to alter the array
 */

public class Book {
    private Author author;
    private String title;
    private int year;
    private String publisher;
    private String genre;
    private double rating;
    private double price;

    public Book(){
        // defaults the varibles
        this.author = new Author();
        this.title = "";
        this.year = 0;
        this.publisher = "";
        this.genre = "";
        this.rating = 0.0;
        this.price = 0.0;
    }

    public Book(Author author, String title, int year, String genre, String publisher, double rating, double price){
        this.author = author;
        this.title = title;
        this.year = year;
        this.publisher = publisher;
        this.genre = genre;
        this.rating = rating;
        this.price = price;
    }

    public Author getAuthor(){
        return this.author;
        // initializing my getters and setters
    }

    public String getTitle(){
        return this.title;
    }

    public int getYear(){
        return this.year;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public String getGenre(){
        return this.genre;
    }

    public double getRating(){
        return this.rating;
    }

    public double getPrice() {
        return this.price;
    }

    public void setAuthor(){
        this.author = author;
    }
    public void setTitle(){
        this.title = title;
    }

    public void setYear(){
        this.year = year;
    }

    public void setGenre(){
        this.genre = genre;
    }

    public void setPublisher(){
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Method to make a string representation of Book
    public String toString(){
        author.toString();
        String bookstring = author.toString() + " : " + title + " : " + genre + " : " + year + ": " + rating + ": " + price;
        return bookstring;
    }

}
