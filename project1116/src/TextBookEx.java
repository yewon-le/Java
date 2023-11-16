
public class TextBookEx {
    public static void main(String[] args) {
        TextBook book1 = new TextBook("자바프로그래밍", 100, "황기태", "1학년 1학기", "동양미래대학교");
        TextBook book2 = new TextBook("국어",40, "선생님", "2학년 2학기", "서울초등학교");

        book1.printInfo();
        System.out.println("------------------------");
        book2.printInfo();
    }
}
