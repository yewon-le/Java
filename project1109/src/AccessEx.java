class Sample{
	public int a;
	//private int b; //b는 private 으로 선언되었기 때문에 AccessEx에서 접근 불가능
	int b;
	int c;
}
public class AccessEx {

	public static void main(String[] args) {
		Sample aClass = new Sample();
		aClass.a =10;
		aClass.b =10;
		aClass.c =10;
	}
}
