package W6;

class SimpleMethod { // 메소드 오버로딩
    static int getSum(int a, int b) {
        return a + b;
    }

    static int getSum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Ex00035 {
    public static void main(String[] args) {
        System.out.println(SimpleMethod.getSum(1, 2));
        System.out.println(SimpleMethod.getSum(1, 2, 3));
    }
}
