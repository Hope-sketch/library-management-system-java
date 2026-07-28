//Name: Njabulo Hope Makana
//Date: 21 October 2025

//abstract class
public abstract class User {
    private int id;
    private String name;

    // Constructor
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getRole();

    // Method to display user info
    public String getUserDetails() {
        return "User ID: " + id + "\nName: " + name + "\nRole: " + getRole();
    }
}
