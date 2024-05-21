import java.util.Scanner;
public class Ex00030_Rectangle {
    int width;
    int height;
    public int getArea() {
        return width*height;
    }
    public static void main(String[] args) {
        Ex00030_Rectangle rect = new Ex00030_Rectangle();
        Scanner scanner = new Scanner(System.in);
        System.out.print("너비를 입력하세요>> ");
        rect.width = scanner.nextInt();
        System.out.print("높이를 입력하세요>> ");
        rect.height = scanner.nextInt();
        System.out.println("\n");
        for (int i = 0; i<rect.height; i++){
            System.out.print("* ");
            for (int j = 0; j<rect.width; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n사각형의 면적은" + rect.getArea() + " 입니다.");
        scanner.close();
    }
}
