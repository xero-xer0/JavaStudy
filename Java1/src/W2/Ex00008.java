import java.util.Scanner;

public class Ex00008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int time = scanner.nextInt();
        int second = time % 60; // 초
        int minute = (time / 60) % 60; // 분
        int hour = (time / 60) / 60; // 시간
        int day = (time / 60) / 60 / 24; // 일
        System.out.println(time + "초는 " + day + "일 " + hour + "시간 " + minute + "분 " + second + "초 입니다.");
        scanner.close();
    }
}