// 클래스 설계도를 이용하여 객체생성
public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle();
			pizza.name = "불고기피자";
			pizza.radius = 10;
			double area = pizza.getArea();
			System.out.println(pizza.name+ "의 면적은= " + area);
			// 객체 2개 도넛
			Circle donut = new Circle();
			donut.radius=2;
			donut.name = "던킨도넛";
			area = donut.getArea();
			System.out.println(donut.name+"의 면적은" + area);
			
	}
}
