package W6;
class StaticSample2 {
    public int n;
    public static int m;
    public void g() { 
        n = 20;
    }
    public void h() {
        m = 30;
    }
    public static int o;
    public static void f() {
        m = 5;
    }
}
public class Ex00037 {
    public static void main(String[] args) {
        StaticSample2 s1, s2;
        s1 = new StaticSample2();
        s1.n = 5;
        s1.g();
        s1.m = 50; //static
        s2 = new StaticSample2();
        s2.n = 8;
        s2.h();
        s2.f(); //static
        System.out.println(s1.m);
    }
}
