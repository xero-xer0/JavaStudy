package W6;

class Point {
    int x, y;

    void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void ShowPoint() {
        System.out.println(x + "," + y);
    }
}

class PointColor extends Point{
    int color;
    void setColor(int color) {
        this.color = color;
    }
    void ShowColorPoint() {
        ShowPoint();
        System.out.println(this.color);
    }
}


public class Ex00038 {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.set(2, 3);
        p1.ShowPoint();

        PointColor p2 = new PointColor();
        p2.set(3, 4);
        p2.setColor(256);
        p2.ShowColorPoint();
    }
}
