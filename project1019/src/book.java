// 설계도, 붕어빵틀, main()x
public class book {
	// 1. 속성, 필드, 변수
	String title;	// 제목
	String author;	// 저자
	// 2. 생성자, 클래스이름동일, 여러개
	public book() {} // 기본생성자, default constructor
	public book( String title) {
		this.title = title;
		author ="작자미상";
		
	}
	public book(String title, String author) {
		this.title = title;
		this.author =author;
	}
	// 3. method
}

