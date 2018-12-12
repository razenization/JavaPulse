package hw02.book;

public class BookProgram {
    public static void main(String[] args) {
        BookList books = new BookList();
        books.add(new Book(1, "Harry Potter", "Joanne Rowling", "Folio", 2011, 652, 300, "Hard"));
        books.add(new Book(2, "Shining", "Stephen King", "Lazarius", 2002, 360, 220, "Soft"));
        System.out.println(books.booksByAuthor("Joanne Rowling"));
        System.out.println(books.booksbyOffice("Lazarius"));
        System.out.println(books.newestBooks(2005));
    }
}