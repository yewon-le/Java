import java.util.Iterator;

public class BookArray {

	public static void main(String[] args) {
		int [] intArr = new int[5];
		Book [] bkArr = new Book[5];
		bkArr[0] = new Book("누가 내머리에 똥 쌌어", "베르네");
		bkArr[1] = new Book("little Prince", "생택쥐베리");
		bkArr[0].show();
		bkArr[1].show();
		System.out.println("*----------*");
		System.out.println(bkArr[0].title + "," + bkArr[0].author);
		System.out.println(bkArr[1].title + "," + bkArr[1].author);
		for (Book item : bkArr) {
			System.out.println(item.title + "," + item.author);
		}
		for (int i = 0; i<bkArr.length; i++) {
			System.out.println(bkArr[i].title + "," + bkArr[i].author);
		}
	}
}


