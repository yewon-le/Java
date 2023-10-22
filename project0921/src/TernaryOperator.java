import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =3, b =5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 정수를 입력하시오.");
		int A =scan.nextInt();
		int B =scan.nextInt();
		System.out.println("두 수의 차는" + ((a>b)? (a-b): (b-a)));
	}
}