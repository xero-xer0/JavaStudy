public class Ex00016 {
    public static void main(String[] args) {
        for (int j = 0; j < 10; j++) {
            int i = 0;
            for (i = 0; i < 10 - j; i++) {
                System.out.print("  ");
                for (; i < 10; i++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

}