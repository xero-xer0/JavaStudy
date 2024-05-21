package W7;
class Person {
    String name;
    String id;

    public Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String grade;
    String department;

    public Student(String name) {
        super(name);
    }
}

public class Ex00040 {
    public static void main(String[] args) {
        Person p;
        Student s = new Student("홍길동");
        s.grade = "A";

        p = s;

        System.out.println(s.name);
        System.out.println(s.grade);
        System.out.println(p.name);
    }
}
