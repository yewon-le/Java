
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int i=0;
		for (int i=0; i<10; i++) {
			System.out.print(i);
		}
		// System.out.println("end i = "+ i);
		System.out.println();
		System.out.println("===2번째 합구하기");
		int sum =0;
		for (int i=1; i<=5; i++) {
			sum +=i;
			System.out.println("i= "+ i + "sum = " + sum);
			
		}
		System.out.println("1~5까지의 합= " + sum);

	}

}
