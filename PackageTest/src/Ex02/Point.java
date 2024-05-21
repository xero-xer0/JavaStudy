package Ex02;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "point (" + this.x + "," + this.y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        Point p = ((Point) obj);
        if(x == p.x && y == p.y) {
            return true;
        } else {
            return false;
        }
    }
}
