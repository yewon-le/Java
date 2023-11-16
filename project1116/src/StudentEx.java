
public class StudentEx {
    public static void main(String[] args) {
        Student student = new Student("예원", "양천구", "010-1111-2222", "동양미래대학교", 20231643);

        System.out.println("Student Information:");
        System.out.println("Name: " + student.name);
        System.out.println("Address: " + student.addr);
        System.out.println("Phone: " + student.phone);
        System.out.println("School: " + student.school);
        System.out.println("Student ID: " + student.stuId);
    }
}
