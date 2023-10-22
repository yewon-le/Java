import java.util.Scanner;
public class DivideByZero {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int dividend;
			int divisor;
			
			System.out.print("나뉨수를 입력하세요:");
			dividend= scanner.nextInt();
			System.out.print("나눗수를 입력하세요:");
			divisor= scanner.nextInt();
			System.out.println(dividend+"를"+divisor+"로 나눈면 몫은"+dividend/divisor+"입니다.");
		
			
			
			
		} 
		catch (Exception e) {
		System.out.println("0으로 나눠서 error!");
		System.out.println("divisor를 0으로 입력하지마세요.");
		e.printStackTrace();
		}
		
		scanner.close();
	}

}
