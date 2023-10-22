
public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum=0.0;
		
		for (int i=0; i<args.length; i++)
			sum += Double.parseDouble(args[i]); // 문자열을 실수타입으로 변환
		
		System.out.println("합계:"+sum);

	}

}
