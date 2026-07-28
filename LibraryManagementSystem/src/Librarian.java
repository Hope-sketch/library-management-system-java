//Name: Njabulo Hope Makana
//Date: 22 October 2025

public class Librarian extends User {

    // Constructor
    public Librarian(int id, String name) {
        super(id, name);  // calls the constructor from User class
    }

    // Override the abstract method from User
    @Override
    public String getRole() {
        return "Librarian";
    }

    
    public void manageBooks() {
        System.out.println(getName() + " is managing the library books.");
    }
}
