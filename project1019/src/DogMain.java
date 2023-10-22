
public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // 강아지 객체 생성
    Dog dog1 = new Dog("맥스", "골든 리트리버", 3, "금색");
    Dog dog2 = new Dog("벨라", "시베리안 허스키", 2, "회색");

    // 정보 출력
    System.out.println("첫 번째 강아지의 정보:");
    dog1.display();
    System.out.println("\n두 번째 강아지의 정보:");
    dog2.display();

    // 메소드 호출
    System.out.println("\n첫 번째 강아지:");
    dog1.barking();
    dog1.hungry();
    dog1.sleeping();

    System.out.println("\n두 번째 강아지:");
    dog2.barking();
    dog2.hungry();
    dog2.sleeping();
	}
}





