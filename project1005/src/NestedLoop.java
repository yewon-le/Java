
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<10; i++) { // 2단에서 9단
			for(int j=2; j<10; j++) { // 각 단의 구구셈 출력
			System.out.print(i + "*" + j + "=" + i*j); // 구구셈 출력
			System.out.print('\t'); // 하나씩 탭으로 띄기
		}
		System.out.println(); // 한 단이 끝나면 다음 줄로 커서 이동
		}

	}

}
