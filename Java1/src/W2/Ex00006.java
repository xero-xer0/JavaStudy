public class Ex00006 {
    public static void main(String[] args) {
        long m = 25;
        System.out.println("m : " + m);
        double d = 3.14 + m; // 자동타입전환, long->double
        System.out.println("d : " + d);
        int n = 300; // 32비트
        byte b = (byte) n; // 강제타입변환, int(32)->byte(8) 8비트-> 0-255
        System.out.println("n : " + n);
        System.out.println("b : " + b);

        // System.out.println(x:0x12340041);
        System.out.println((char) 0x12340041);

    }
}
