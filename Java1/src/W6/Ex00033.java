package W6;

public class Ex00033 {
    static void increase(int m) {
        m = m + 1;
        System.out.println("in increase : " + m);
    }

    static void increase(Circle m) {
        m.radius = m.radius + 1;
        System.out.println("in increase : " + m.radius);
    }

    public static void main(String[] args) {

        int m = 0;
        increase(m);

        System.out.println("in main : " + m);

        Circle cr = new Circle(1);
        increase(cr);
        System.out.println("in main : " + cr.radius);
    }
}
