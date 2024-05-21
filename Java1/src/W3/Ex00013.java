import java.util.Scanner;

public class Ex00013 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();
        if (score < 0 || score > 100) { // 점수가 0보다 작거나 100보다 크면 잘못 입력했다고 출력
            System.out.println("점수를 잘못 입력하셨습니다.");
            scanner.close();
        }
        System.out.println("나이를 입력하세요 : ");
        int age = scanner.nextInt();

        if (age <= 0) { // 나이가 0보다 같거나 작으면 잘못 입력했다고 출력
            System.out.println("나이를 잘못 입력하셨습니다.");
            scanner.close();
        }
        if (score >= 60) {
            if (age >= 60)
                System.out.println("합격입니다.");
            else if (score >= 70)
                System.out.println("합격입니다.");
            else
                System.out.println("불합격입니다.");
        } else
            System.out.println("불합격입니다.");

        scanner.close();
    }
}