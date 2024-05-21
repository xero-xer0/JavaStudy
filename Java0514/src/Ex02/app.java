package Ex02;

import java.util.*;

public class app {
    public static void main(String[] args) {

        var vi = new Vector<Integer>();
        Vector<point> v = new Vector<point>();
        v.add(new point(2, 3));
        v.add(new point(-5, 20));
        v.add(new point(30, -8));

        point p1 = v.get(1);
        // p1.setPoint(0,0);
        

        for (int i = 0; i < v.size(); i++) {
            point p = v.get(i);
            System.out.println();
        }
    }
}
