
public class StudentMain {

	public static void main(String[] args) {
		System.out.println("학생수 = " + Student.count);
		Student st1 = new Student("정국", 22, "010-1111-1111");
		Student st2 = new Student("유재석", 43, "010-2222-2222");
		Student st3 = new Student("산다라박", 28, "010-1131-1111");
		Student st4 = new Student("준혁", 22, "010-1111-1131");
	
		st1.show();
		st2.show();
		st3.show();
		st4.show();
		System.out.println("total student = " + Student.count);
	}

}
