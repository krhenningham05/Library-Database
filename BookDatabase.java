/*
Kadin Henningham
COMP167 003
Feburary 25, 2024
Serves as a foundation for maintaining a database of books that performs various operations on the collection of books
 */

import java.util.ArrayList;

public class BookDatabase {
    private ArrayList<Book> books = new ArrayList<Book>(); // Creates an arrayList

    public BookDatabase(){
        this.books = new ArrayList<Book>(); // Initializes the array with default values
    }

    public BookDatabase(ArrayList<Book> books){ //
        this.books = books; // Initializes the array with given values
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }


// method to search for author
    public ArrayList<Book> search(Author author){
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        // Populates this array when a book is found by a certain author
        for (Book var: books) {
            if (var.getAuthor().getFirstName().equals(author.getFirstName()) && var.getAuthor().getLastName().equals(author.getLastName())){
                foundBooks.add(var);
                // adds the book made by the author
            }
        }
        return foundBooks;
    }

    // method to search for year
    public ArrayList<Book> search(int startYear, int endYear){
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        // populates when the book is within a given year
        for (Book var: books){
            if ((var.getYear() >= startYear) && (var.getYear() <= endYear)){
                foundBooks.add(var);
            }
        }
        return foundBooks;
    }

// method to search for genre
    public ArrayList<Book> search(String genre){
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        // populates when the book is in a certain genre
        for (Book var: books){
            if(var.getGenre().equals(genre)){
                foundBooks.add(var);
            }
        }
        return foundBooks;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

// Method to make a string representation of BookDatabase
    public String toString(){
        String bookstring = "";
        for (Book var : books){
            bookstring += var.toString();
        }
        return bookstring;
    }

}
