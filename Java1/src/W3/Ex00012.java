import java.util.Scanner;

public class Ex00012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        if (num % 2 == 0)
            System.out.println("입력하신 숫자는 짝수입니다.");
        else
            System.out.println("입력하신 숫자는 홀수입니다.");

        scanner.close();

    }
}