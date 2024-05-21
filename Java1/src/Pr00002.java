import java.util.Scanner;

public class Pr00002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("학점을 입력하세요 : ");
        double grade = scanner.nextDouble();

        if (grade > 4.5 || grade < 1.0) {
            System.out.println("잘못된 학점입니다.");
        } else if (grade >= 4.0) {
            System.out.println("당신의 학점은 A입니다.");
        } else if (grade >= 3.0) {
            System.out.println("당신의 학점은 B입니다.");
        } else if (grade >= 2.0) {
            System.out.println("당신의 학점은 C입니다.");
        } else if (grade >= 1.0) {
            System.out.println("당신의 학점은 D입니다.");
        } else {
            System.out.println("당신의 학점은 F입니다.");
        }
        scanner.close();
    }
}
