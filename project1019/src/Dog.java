
public class Dog {
	String name;
	String bread;
	int age;
	String color;
	
	public Dog() {}
	public Dog(String name,String bread,int age,String color) {
		this.name=name;
		this.bread=bread;
		this.age=age;
		this.color=color;
	}
	
		public void barking() {
	        System.out.println(name + "멍멍 짖는다");
	    }

	    // 배고픈 메소드
	    public void hungry() {
	        System.out.println(name + "배고파요");
	    }

	    // 자는 메소드
	    public void sleeping() {
	        System.out.println(name + "ZZzz....");
	    }

	    // 정보 출력 메소드
	    public void display() {
	        System.out.println("이름: " + name);
	        System.out.println("종: " + bread);
	        System.out.println("나이: " + age + "세");
	        System.out.println("색깔: " + color);

	}
	

}
