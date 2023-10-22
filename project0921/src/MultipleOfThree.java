import java.util.Scanner;

public class MultipleOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan  = new Scanner(System.in);
		System.out.print("수를 입력하시오:");
		int number = scan.nextInt();
		if (number % 3 == 0) // 3으로 나누었을 때 머지가 0
		System.out.println(number + "은 3의 배수입니다.");
		else
		System.out.println(number + "은 3의 배수가 아닙니다.");
		
		scan.close();
		
	}
}
