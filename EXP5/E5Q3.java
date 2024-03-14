class LibraryItem {
    private String title;
    private String author;
    private boolean checkedOut;

    LibraryItem(String title, String author) {
        this.title = title;
        this.author = author;
        this.checkedOut = false;
    }

    public String checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            return title + " has been checked out.";
        } else {
            return title + " is already checked out.";
        }
    }

    public String returnItem() {
        if (checkedOut) {
            checkedOut = false;
            return title + " has been returned.";
        } else {
            return title + " is already in the library.";
        }
    }
}

class Book extends LibraryItem {
    private String genre;

    Book(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }
}

class DVD extends LibraryItem {
    private String director;
    private int duration;

    DVD(String title, String author, String director, int duration) {
        super(title, author);
        this.director = director;
        this.duration = duration;
    }
}

class Journal extends LibraryItem {
    private String editor;
    private String publicationDate;

    Journal(String title, String author, String editor, String publicationDate) {
        super(title, author);
        this.editor = editor;
        this.publicationDate = publicationDate;
    }
}

public class E5Q3 {
    public static void main(String[] args) {
        // Create a book
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", "Fiction");

        // Check out the book
        String checkedOutMessage = book.checkOut();
        System.out.println(checkedOutMessage);

        // Check out the book again, which should fail
        checkedOutMessage = book.checkOut();
        System.out.println(checkedOutMessage);

        // Return the book
        checkedOutMessage = book.returnItem();
        System.out.println(checkedOutMessage);

        // Check out the book again, which should succeed
        checkedOutMessage = book.checkOut();
        System.out.println(checkedOutMessage);

        // Return the book again
        checkedOutMessage = book.returnItem();
        System.out.println(checkedOutMessage);
    }
}