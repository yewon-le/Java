import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하시오.");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); // 문자열 읽기
		System.out.println("이름은" + name + " ");
		
		String city = scanner.next(); // 문자열 읽기
		System.out.print("도시는 "+ city + " ");
		
		int age = scanner.nextInt(); // 정수 읽기
		System.out.println("나이는" + age + " 살, ");
		
		double weight = scanner.nextDouble(); // 실수 읽기
		System.out.println("체중은 " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); // 논리값 읽기
		System.out.println("독신 여부는 " + single + "입니다.");
		
		scanner.close(); // scanner 닫기
			
	}

}
