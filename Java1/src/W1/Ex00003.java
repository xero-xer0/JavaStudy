public class Ex00003 {
    public static void main(String[] args) {
        int a1 = 0x10;
        int a2 = 0b10;
        System.out.println(a1);
        System.out.println(a2);

        float _pi = 3.14f;
        double __pi = 3.14;
        System.out.println(_pi);
        System.out.println(__pi);

        long b1 = 243456754976085436l;
        int b2 = 24;
        System.out.println(b1);
        System.out.println(b2);

        double d = 0.1234;
        double e = 1234E-4;
        double f = 1234E+4;

        System.out.println("d : " + d);
        System.out.println("e : " + e);
        System.out.println("f : " + f);
        System.out.printf("f : %.0f \n", f);
    }

}
