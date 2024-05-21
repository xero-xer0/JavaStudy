package W7;
class person3 {
    String name;
    person3() {
    }
    public person3(String name) {
        this.name = name;
    }
    public void print() {
        System.out.println(name);
    }
}
class student3 extends person3 {
    String grade;
    public student3(String name, String grade) {
        super(name);
        this.name = name;
        this.grade = grade;
    }
    public void print() {
        super.print();
        System.out.println(grade);
    }
}
class professor3 extends person3 {
    String subject;
    public professor3(String name, String subject) {
        super(name);
        this.name = name;
        this.subject = subject;
    }
    public void print() {
        super.print();
        System.out.println(subject);
    }
}
public class Ex00041 {
    void print(person3 p) {
        System.out.println(p.name);

        if(p instanceof student3){
            System.out.println(((student3)p).grade);
        }
        else if(p instanceof professor3) {
            System.out.println(((professor3)p).subject);
        }
    }
    public static void main(String[] args) {
        person3 p1 = new student3("lee", "grade3");
        person3 p2 = new professor3("kim", "java");
        p1.print();
        p2.print();
        
    }
    
}
