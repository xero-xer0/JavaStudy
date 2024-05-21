package Ex02;

// class Point {
//     private int x, y;

//     public Point(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     @Override
//     public String toString() {
//         return "point (" + this.x + "," + this.y + ")";
//     }
// }

public class app {
    public static void main(String[] args) {
        Point p = new Point(3, 4);
        System.out.println(p.getClass().getName());
        System.out.println(p.hashCode());
        System.out.println(p.toString());
        System.out.println(p);
    }
}
