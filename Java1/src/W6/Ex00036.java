package W6;
class StaticSample {
    static int m;
    int n;
    int getNumber() {
        return m + n;
    }
}
public class Ex00036 {
    public static void main(String[] args) {
        StaticSample a = new StaticSample();
        StaticSample b = new StaticSample();
        a.n = 1;
        b.n = 2;
        System.out.println(a.n + "," +b.n);


        // a.m = 1;
        // b.m = 3;
        StaticSample.m = 3;
        // System.out.println(a.m + "," +b.m);
        System.out.println(a.getNumber());
        System.out.println(b.getNumber());
    }
}
