
public class Student {


	// 1. field
	String name;
	int age;
	String phone;
	static int count; // 학생수
	
	// 2.생성자
	public Student() {
		count ++;
	}
		public Student (String name, int age, String phone) {
			count ++;
			this.name = name;
			this.age = age;
			this.phone = phone;
		}
		
	
	// 3. 메소드
		void show() {
			System.out.println(name + "," + age + "," + phone);
		
	}

}
