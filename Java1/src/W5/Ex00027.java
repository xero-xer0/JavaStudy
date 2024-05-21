import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex00027 {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("정수 3개를 입력하세요.");
        int sum = 0, n = 0;
        for(int i = 0; i<3; i++) {
            System.out.println(i+1 + "번째 정수 >>");
            try {
                n = scanner.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("정수가 아닙니다. 다시 입력하세요!");
                scanner.next();
                i--;
                continue;
            }
            sum += n;
        }
        System.out.println("합은 " + sum + "입니다.");
        scanner.close();
    }
}
