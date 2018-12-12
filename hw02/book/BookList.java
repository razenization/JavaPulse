package hw02.book;

import java.util.Arrays;

public class BookList {

    private Book[] books;
    private int counter;

    public BookList() {
        books = new Book[3];
        counter = -1;
    }

    public void add(Book book) {
        if (counter == books.length - 1) {
            books = Arrays.copyOf(books, books.length * 2);
        }
        books[++counter] = book;
    }

    public Book get(int i) {
        if (i < size())
            return books[i];
        else return null;
    }

    public int size() {
        return counter + 1;
    }

    public void print() {
        for (int i = 0; i < size(); i++) {
            System.out.println(books[i]);
        }
    }

    public void update(int i, Book book) {
        if (i < size())
            books[i] = book;
    }
//
//    public BookList studsByFac(String faculty) {
//        BookList resStuds = new BookList();
//        for (int i = 0; i < size(); i++) {
//            if (books[i].getFaculty().equals(faculty)) {
//                resStuds.add(books[i]);
//            }
//        }
//        return resStuds;
//    }

    public BookList booksByAuthor(String author) {
        BookList authorBooks = new BookList();
        for (int i = 0; i < size(); i++) {
            if (books[i].getAuthor().equals(author)) {
                authorBooks.add(books[i]);
            }
        }
        return authorBooks;
    }

    public BookList booksbyOffice(String office) {
        BookList officeBooks = new BookList();
        for (int i = 0; i < size(); i++) {
            if (books[i].getPostoffice().equals(office)) {
                officeBooks.add(books[i]);
            }
        }
        return officeBooks;
    }

    public BookList newestBooks(int year) {
        BookList newBooks = new BookList();
        for (int i = 0; i < size(); i++) {
            if (books[i].getReleaseYear() > year) {
                newBooks.add(books[i]);
            }
        }
        return newBooks;
    }

    @Override
    public String toString() {
        String out = "";
        for (Book book : books) {
            if (book != null)
                if (out.equals(""))
                    out = out + book;
                else out = out + ", " + book;
        }
        return out;
    }
}