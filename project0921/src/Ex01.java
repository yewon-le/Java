import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력하시오. name = ? ");
		String name = scan.next();
		System.out.println("이름,name = " + name);
		System.out.println("나이를 입력하시오. age = ?");
		int age = scan.nextInt();
		System.out.println("나이, age = " + age);
		//----------------------------------------------
		System.out.println("이름과 나이를 한칸띄어 입력하시오.");
		name = scan.next();
		age = scan.nextInt();
		System.out.println("이름,name = " + name + "나이, age = " + age );

	}

}
