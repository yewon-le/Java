
public class MagaEx {
    public static void main(String[] args) {
        Magazine mag1 = new Magazine("중앙일보", 100, "김중앙", "2023-01-01");
        Magazine mag2 = new Magazine("뉴욕타임즈", 60, "이뉴욕", "2023-02-01");

        System.out.println("Magazine Information 1:");
        System.out.println("Title: " + mag1.title);
        System.out.println("Pages: " + mag1.pages);
        System.out.println("Author: " + mag1.author);
        System.out.println("Release Date: " + mag1.date);

        System.out.println("------------------------");

        System.out.println("Magazine Information 2:");
        System.out.println("Title: " + mag2.title);
        System.out.println("Pages: " + mag2.pages);
        System.out.println("Author: " + mag2.author);
        System.out.println("Release Date: " + mag2.date);
    }
}
