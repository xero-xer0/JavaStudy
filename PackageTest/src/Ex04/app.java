package Ex04;

public class app {
    static void test(Integer _i) {
        _i = Integer.valueOf(9);
        _i = 9;
    }

    public static void main(String[] args) {
        Integer i = Integer.valueOf(10);
        int ii = i;
        float fi = i.floatValue();

        System.out.println(ii);
        System.out.println(fi);

        test(i);
        System.out.println(i);

        i = Integer.parseInt("8");
        System.out.println(i);

        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);

        String str_b = Boolean.toString(b);
        System.out.println(str_b);
        System.out.println(Integer.toHexString(15));
        System.out.println(Integer.toBinaryString(15));

    }
}
