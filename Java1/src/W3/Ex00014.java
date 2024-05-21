import java.util.Scanner;

public class Ex00014 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" 연산자를 선택하세요 : ");
        String _op = scanner.nextLine();

        System.out.println("두 개의 수를 입력하세요 : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        char _op_char = _op.charAt(0);

        switch (_op_char) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                break;
            case '$':
                System.out.println(num1 + " $ " + num2 + " = " + ((num1 + num2) / 2));
                break;
            default:
                System.out.println("잘못된 연산자입니다. [+, -, *, /, $] 중에서 선택하세요.");
                break;
        }


        /*
        if (_op_char == '+') {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } else if (_op_char == '-') {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        } else if (_op_char == '*') {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        } else if (_op_char == '/') {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        }
        */
        scanner.close();
        
    }
}
