
public class Book {

	String title;
	String author;

	public Book() {
		this("","");
		System.out.println("기본생성자 호출됨");
	}
	public Book(String title) {
		this(title,"작자미상");
	}
		
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}


	//메소드
	void show() {
		System.out.println( title  + " , " + author );
	}
}