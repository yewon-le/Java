
public class MovieMain {
    public static void main(String[] args) {
        // 영화 객체 생성
        Movie movie1 = new Movie("인셉션", 8.8, "크리스토퍼 놀란", 2010);
        Movie movie2 = new Movie("어바웃 타임", 7.8, "리처드 커티스", 2013);

        // 정보 출력
        System.out.println("첫 번째 영화 정보:");
        movie1.print();
        System.out.println("\n두 번째 영화 정보:");
        movie2.print();
    }
}
