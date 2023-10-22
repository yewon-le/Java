
public class ForeachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n = {1,2,3,4,5};
		String names[] = {"사과", "배" , "바나나" , "체리" , "딸기" , "포도"};
		
		int sum=0;
		// 아래 for-each문에서 k는 n[0],n[1],,,n[4]로 반복
		for(int k : n) {
			System.out.print(k+""); // 반복되는 k값 출력
			sum += k;
		}
		System.out.println("합은"+sum);
		
		for(String s: names)
			System.out.print(s+ " ");
		System.out.println();
		

	}

}
