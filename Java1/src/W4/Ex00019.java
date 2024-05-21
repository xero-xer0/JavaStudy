import java.util.Scanner;

public class Ex00019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println(">>");
            String text = scanner.nextLine();
            if(text.equals("help")){
                System.out.println("종료하려면 exit이라고 입력하세요.");
            }
            else if (text.equals("exit")) {
                break;
                
            }

        }
        scanner.close();
    }
}
