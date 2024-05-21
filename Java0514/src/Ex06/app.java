package Ex06;
import java.util.*;

public class app {
    public static void main(String[] args) {
        myClass<String> s = new myClass<>();
        myClass<Integer> n = new myClass<>();

        s.set("Hello");
        n.set(123);
        System.out.println(n.get());
        System.out.println(s.get());
    }
}
