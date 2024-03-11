/*
Kadin Henningham
COMP167 003
Feburary 25, 2024
Reads book data from dataset.csv, populates BookDatabase, performs searches based on author, year, genre and
outputs those values
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class clientProgram {

    public static void main(String[] args) {
        String[] dataBook = new String[8]; // dataBook is an array that takes input from the file
        String title;
        String publisher;
        String genre;
        String firstName;
        String lastName;
        int year;
        double rating;
        double price;
        BookDatabase bookDatabase = new BookDatabase(); // Creates a new bookDatabase object so adding books and searching is possible

        try {
            File myObj = new File("dataset.csv"); //Reads the file
            Scanner myReader = new Scanner(myObj);

            if (myReader.hasNextLine()) { //Skips the first line so year, rating, and price is able to be read in the array
                myReader.nextLine();
            }

            while (myReader.hasNextLine()) {
                dataBook = myReader.nextLine().split(","); // splits the file into an array

                firstName = dataBook[0]; // indexes the variables
                lastName = dataBook[1];
                title = dataBook[2];
                year = Integer.parseInt(dataBook[3]); //Converts the string value into an int
                genre = dataBook[4];
                publisher = dataBook[5];
                rating = Double.parseDouble(dataBook[6]); // Does the same thing here but, instead it is Double and not int
                price = Double.parseDouble(dataBook[7].substring(1));


                Author author = new Author(firstName, lastName); // Creates a new Author object to grab first and last Name
                Book book = new Book(author, title, year, genre, publisher, rating, price); // Creates a new Book object
                bookDatabase.addBook(book); // Goes to the bookDatabase file and adds a new book
            }


            ArrayList<Book> testGenre = bookDatabase.search("Poetry Anthologies"); // Searches through genres
            ArrayList<Book> testAuthor = bookDatabase.search(new Author("Jon", "Stewart")); // Searches through Author
            ArrayList<Book> testYear = bookDatabase.search(2009, 2009); // Searches through year

            // System.out.println("Search for genre: ");

            System.out.println("Books by Genre: ");
            for (Book value : testGenre) { // Iterates through the new arrayList testGenre and prints out the genres
                System.out.println(value);
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Books by Author: ");
            for (Book value : testAuthor) { // Iterates through the new arrayList testAuthor and prints out the authors
                System.out.println(value);
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            System.out.println("Books by Year: ");
            for (Book value : testYear) { // Iterates through the new arrayList testYear and prints out the years
                System.out.println(value);
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

