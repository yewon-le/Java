
class Book {
    String title;
    int pages;
    String author;

    public Book(String title, int pages, String author) {
        this.title = title;
        this.pages = pages;
        this.author = author;
    }
}

class Magazine extends Book {
    String date;

    public Magazine(String title, int pages, String author, String date) {
        super(title, pages, author);
        this.date = date;
    }
}
