import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n, sum1 = 0, sum2 = 0;
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(i%2 == 0)
				sum1 += i;
			else
				sum2 += i;
	}
		System.out.println("1~"+n+"까지 짝수의 합="+ sum1);
		System.out.println("1~"+n+"까지 홀수의 합="+ sum2);
		

	}

}
