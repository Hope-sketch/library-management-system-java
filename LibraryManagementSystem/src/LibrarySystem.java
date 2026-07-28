//Name: Njabulo Hope Makana
//Date: 22 October 2025

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem {
    private static ArrayList<Book> books = new ArrayList<>();
    private static ArrayList<Member> members = new ArrayList<>();
    private static Librarian librarian = new Librarian(1, "Admin");

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        

        //Adding books for test, and it works
        books.add(new Book(1, "Hopie", "James Gosling"));
        books.add(new Book(2, "Data Structures", "Robert Lafore"));
        books.add(new Book(3, "Clean Code", "Robert C. Martin"));
        books.add(new Book(4, "How to be Hope", "Njbaulo Hope Makana"));

        
        while (running) {
            System.out.println("*****************************************");
            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Login as Librarian");
            System.out.println("2. Login as Member");
            System.out.println("3. Exit");
            System.out.println("*******************************************");
            System.out.print("Choose option: ");
            int choice = safeIntInput(input);

            
            switch (choice) {
                case 1 -> librarianMenu(input);
                case 2 -> memberMenu(input);
                case 3 -> {
                    running = false;
                    System.out.println("Goodbye!");
                }
                default -> System.out.println("Invalid option.");
            }
        }

        input.close();
    }

    private static void librarianMenu(Scanner input) {
        boolean back = false;
        while (!back) {
            System.out.println("********************************************");
            System.out.println("\n===== LIBRARIAN MENU =====");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Add Member");
            System.out.println("5. View Members");
            System.out.println("6. Logout");
            System.out.println("********************************************");
            System.out.print("Choose: ");
            
            int option = safeIntInput(input);

            switch (option) {
                case 1 -> addBook(input);
                case 2 -> displayBooks();
                case 3 -> searchBooks(input);
                case 4 -> addMember(input);
                case 5 -> displayMembers();
                case 6 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void memberMenu(Scanner input) {
        if (members.isEmpty()) {
            System.out.println("No members found. Ask librarian to add you first.");
            return;
        }

        System.out.print("Enter your Member ID: ");
        int id = safeIntInput(input);
        Member member = findMemberById(id);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        boolean back = false;
        while (!back) {
            System.out.println("********************************************");
            System.out.println("\n===== MEMBER MENU =====");
            System.out.println("Welcome, " + member.getName());
            System.out.println("1. View All Books");
            System.out.println("2. Borrow a Book");
            System.out.println("3. Return a Book");
            System.out.println("4. View My Borrowed Books");
            System.out.println("5. Logout");
            System.out.println("********************************************");
            System.out.print("Choose: ");
            int option = safeIntInput(input);

            switch (option) {
                case 1 -> displayBooks();
                case 2 -> borrowBook(input, member);
                case 3 -> returnBook(input, member);
                case 4 -> System.out.println(member.getMemberDetails());
                case 5 -> back = true;
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    private static void addBook(Scanner input) {
        
        System.out.print("Enter Book ID: ");
        int id = safeIntInput(input);
        System.out.print("Enter Title: ");
        String title = input.nextLine();
        System.out.print("Enter Author: ");
        String author = input.nextLine();
        System.out.println("********************************************");

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully!");
    }

    private static void addMember(Scanner input) {
        
        System.out.print("Enter Member ID: ");
        int id = safeIntInput(input);
        System.out.print("Enter Member Name: ");
        String name = input.nextLine();
        System.out.println("********************************************");

        members.add(new Member(id, name, LocalDate.now()));
        System.out.println("Member added successfully!");
    }

    private static void displayBooks() {
        
        System.out.println("\n===== BOOK LIST =====");
        for (Book b : books) {
            System.out.println(b.getBookDetails());
            System.out.println("---------------------");
        }
    }

    private static void displayMembers() {
       
        System.out.println("\n===== MEMBER LIST =====");
        for (Member m : members) {
            System.out.println(m.getMemberDetails());
            System.out.println("---------------------");
        }
    }

    private static void searchBooks(Scanner input) {
        System.out.print("Enter title or author keyword: ");
        String keyword = input.nextLine().toLowerCase();
        boolean found = false;

        for (Book b : books) {
            if (b.getTitle().toLowerCase().contains(keyword) ||
                b.getAuthor().toLowerCase().contains(keyword)) {
                System.out.println(b.getBookDetails());
                System.out.println("---------------------");
                found = true;
            }
        }
        if (!found) System.out.println("No books found.");
    }

    private static void borrowBook(Scanner input, Member member) {
        System.out.print("Enter Book ID to borrow: ");
        int id = safeIntInput(input);
        Book book = findBookById(id);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        try {
            member.borrowBook(book);
        } catch (BookNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void returnBook(Scanner input, Member member) {
        System.out.print("Enter Book ID to return: ");
        int id = safeIntInput(input);
        Book book = findBookById(id);
        if (book != null) {
            member.returnBook(book);
        } else {
            System.out.println("Book not found.");
        }
    }

    private static Book findBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    private static Member findMemberById(int id) {
        for (Member m : members) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    private static int safeIntInput(Scanner input) {
        int num;
        try {
            num = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Try again.");
            num = -1;
        }
        return num;
    }
}
