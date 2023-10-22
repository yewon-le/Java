
public class Movie {
    private String title;
    private double rating;
    private String director;
    private int releaseYear;

    public Movie(String title, double rating, String director, int releaseYear) {
        this.title = title;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public void print() {
        System.out.println("영화 제목: " + title);
        System.out.println("평점: " + rating);
        System.out.println("감독: " + director);
        System.out.println("발표 연도: " + releaseYear);
    }
}

