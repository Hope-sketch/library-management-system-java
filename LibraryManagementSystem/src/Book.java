//Name: Njabulo Hope Makana
//Date: 21 October 2025

//Book class
public class Book {
    //instance variables 
    private int id;//id for each book, it's unique
    private String title;//name of book
    private String author;//author
    private boolean isAvailable;//to tell if a book is available or not

    
    //constructor
    public Book(int id, String title, String author) {//assigning the parameters
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    //getter methods
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    //my formatted string
    public String getBookDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Book ID: ").append(id)
               .append("\nTitle: ").append(title)
               .append("\nAuthor: ").append(author)
               .append("\nAvailable: ").append(isAvailable ? "Yes" : "No");
        return details.toString();
    }
    
    
}


