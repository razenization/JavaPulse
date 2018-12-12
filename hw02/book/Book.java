package hw02.book;

public class Book {
    private int id;
    private String title;
    private String author;
    private String postoffice;
    private int releaseYear;
    private int numberOfPages;
    private int price;
    private String typeOfCover;

    public Book(int id, String title, String author, String postoffice, int releaseYear, int numberOfPages, int price, String typeOfCover) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.postoffice = postoffice;
        this.releaseYear = releaseYear;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.typeOfCover = typeOfCover;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPostoffice() {
        return postoffice;
    }

    public void setPostoffice(String postoffice) {
        this.postoffice = postoffice;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTypeOfCover() {
        return typeOfCover;
    }

    public void setTypeOfCover(String typeOfCover) {
        this.typeOfCover = typeOfCover;
    }

    @Override
    public String toString() {
        return "Book{" +
                id +
                " - " + title +
                " by " + author +
                "; " + price +
                "\u20B4" + '}';
    }
}
