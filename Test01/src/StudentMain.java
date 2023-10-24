
public class StudentMain {

	public static void main(String[] args) {
		Student[] studentList = new Student[3];
		studentList[0] = new Student("Alice", 20);
		studentList[1] = new Student("Bob", 22);
		studentList[2] = new Student("Charlie", 21);
		
		
		for (Student student : studentList) {
			System.out.println(student);
		}
		

	}

}
