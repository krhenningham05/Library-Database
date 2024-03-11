/*
Kadin Henningham
COMP167 003
Feburary 25, 2024
Using getters and setters to populate the Author object with first and last name.
 */

public class Author {
    private String firstName;
    private String lastName;

    public Author(){
        this.firstName = "";
        this.lastName = "";
    }

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }

    public void setLastName(){
        this.lastName = lastName;
    }

    public String toString(){
        String bookstring = firstName + " " + lastName + " ";
        // Accessor and mutator method
        return bookstring;
    }


}