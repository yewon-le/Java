
class Person {
    String name;
    String addr;
    String phone;

    public Person(String name, String addr, String phone) {
        this.name = name;
        this.addr = addr;
        this.phone = phone;
    }
}

class Student extends Person {
    String school;
    int stuId;

    public Student(String name, String addr, String phone, String school, int stuId) {
        super(name, addr, phone);
        this.school = school;
        this.stuId = stuId;
    }
}

