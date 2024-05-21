import java.util.Scanner;
public class Ex00025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("나뉨수를 입력하시오 : ");
            int dividend = scanner.nextInt(); //나뉨수 입력
            System.out.println("나눗수를 입력하시오 : "); //나눗수 입력
            int divisor = scanner.nextInt();

            try {
                System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " + dividend / divisor + "입니다.");
                break; //정상적으로 나누었을 때 while문 탈출
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
            }
        }
        scanner.close();
        
    }
}
