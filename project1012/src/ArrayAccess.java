import java.util.Scanner;

public class ArrayAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Scanner scanner = new Scanner(System.in);
				
		int intArray[] = new int[5]; //배열생성
		
		int max=0; //현재 가장 큰 
		System.out.println("양수 5개를 입력하세요.");
		for( int i=0; i<intArray.length; i++ ) {
			intArray[i] = scanner.nextInt(); //입력받은 정수를 배열에 저
			if(intArray[i] > max) //intArray[i]가 현재 가장 큰 수 보다 크
				max=intArray[i]; // intArray[i]를 max로 변
			
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
		scanner.close();
	}

}
