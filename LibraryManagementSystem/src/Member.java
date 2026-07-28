//Name: Njabulo Hope Makana
//Date: 21 October 2025

import java.time.LocalDate;//used for join date 
import java.util.ArrayList;

public class Member extends User {
    private LocalDate joinDate;
    private ArrayList<Book> borrowedBooks;

    public Member(int id, String name, LocalDate joinDate) {
        super(id, name);
        this.joinDate = joinDate;
        this.borrowedBooks = new ArrayList<>();
    }

    public LocalDate getJoinDate() { return joinDate; }
    public ArrayList<Book> getBorrowedBooks() { return borrowedBooks; }

    
    //for overriding methods
    @Override
    public String getRole() { return "Member"; }

    
    //for when the book is not available
    public void borrowBook(Book book) throws BookNotAvailableException {
        if (!book.isAvailable()) {
            throw new BookNotAvailableException("Sorry, '" + book.getTitle() + "' is currently unavailable.");
        } else {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println(getName() + " borrowed: " + book.getTitle());
        }
    }

    //for returning books 
    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
            System.out.println(getName() + " returned: " + book.getTitle());
        } else {
            System.out.println("This book was not borrowed by " + getName());
        }
    }

    //to show member details
    public String getMemberDetails() {
        StringBuilder details = new StringBuilder();
        details.append("Member ID: ").append(getId())
               .append("\nName: ").append(getName())
               .append("\nJoin Date: ").append(joinDate)
               .append("\nRole: ").append(getRole())
               .append("\nBorrowed Books: ");
        if (borrowedBooks.isEmpty()) {
            details.append("None");
        } else {
            for (Book b : borrowedBooks) {
                details.append("\n - ").append(b.getTitle());
            }
        }
        return details.toString();
    }
}
