package W6;

public class Ex00034 {
    static void inc(int[] m) {
        m[0] = m[0] + 1;
    }

    public static void main(String[] args) {
        int a[] = {1};
        inc(a);
        System.out.println("in main : " + a[0]);
    }
}