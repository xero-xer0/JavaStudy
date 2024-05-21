import java.util.Scanner;

public class Ex00009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        scanner.close();
        if (age < 10)
            System.out.println("당신은 어린이입니다.");
        else if (age > 120)
            System.out.println("당신은 웬만하면 죽었을 겁니다.");
        else
            System.out.println("당신은 " + (age / 10) * 10 + "대입니다."); // 나이를 10으로 나눈 몫(int형)에 10을 곱하면 10대 단위가 됨
    }
}
