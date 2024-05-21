public class Pr00003 {
    public static void main(String[] args) {
        int n = 5; // 삼각형의 크기 설정

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}