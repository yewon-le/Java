// 객체생성
public class bookmain {

	public static void main(String[] args) {
		book bk1 = new book();
		bk1.title = "자바프로그래밍";
		bk1.author = "이예원";
		System.out.println(bk1.title + ","
				+ bk1.author);
		book littlePrince = new book("어린왕자","생텍쥐베리");
		System.out.println(littlePrince.title + 
				"," + littlePrince.author);
		book loveStory = new book("춘향전");
		System.out.println(loveStory.title +
				"," + loveStory.author);
		
		
	}
}
