public class Ex00018 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.print('*');
            if (i > 5) {
                continue;
            }
            if (i > 8)
                System.out.println(i);
        }
    }
}
