import java.util.Scanner;

public class Ex00007 {
    public static void main(String[] args) {
        Scanner _s = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        String strName = _s.nextLine();
        System.out.println("도시명을 입력하세요 : ");
        String city = _s.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = _s.nextInt();
        System.out.println("키를 입력하세요 : ");
        double height = _s.nextDouble();
        System.out.println("이름 : " + strName + ", " + "도시 : " + city + ", " + "나이 : " + age + ", " + "키 : " + height);
        _s.close();
    }
}
