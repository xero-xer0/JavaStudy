public class Ex00002 {
    public static void main(String[] args) {
        int a, b, c;
        a = 1;
        b = 2;
        c = 0;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = 3;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        c = a;
        a = b;
        b = c;

        System.out.println("Swap_a : " + a);
        System.out.println("Swap_b : " + b);
    }
}
