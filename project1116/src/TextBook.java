
class TextBook extends Book {
    String hakgi;
    String school;

    public TextBook(String title, int pages, String author, String hakgi, String school) {
        super(title, pages, author);
        this.hakgi = hakgi;
        this.school = school;
    }

    public void printInfo() {
        System.out.println("Textbook Information:");
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        System.out.println("Author: " + author);
        System.out.println("Semester: " + hakgi);
        System.out.println("School: " + school);
    }
}
