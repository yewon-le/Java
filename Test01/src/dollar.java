import java.util.Scanner;
public class dollar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원화를 입력하세요.(단위원)>>>");
		int won = scanner.nextInt();
		
		double dollar = won/1100;
		
		System.out.println( won +"은"+"$"+ dollar+ " 입니다.");
		scanner.close();
		

	}

}
