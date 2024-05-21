package W6;

class Shape {
    int width, height;

    void set(int w, int h) {
        this.width = w;
        this.height = h;
    }

}

class Triangle extends Shape {
    int getArea() {
        return width * height / 2;

    }

    Triangle() {
        set(10, 5);
    }
}

class Rectangle extends Shape {
    int getArea() {
        return width * height;
    }

    Rectangle() {
        set(10, 5);
    }
}

public class Ex00039 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        Rectangle r = new Rectangle();
        // t.width = 10;
        // t.height = 5;
        // r.width = 10;
        // r.height = 5;
        System.out.println("삼각형의 넓이 : " + t.getArea());
        System.out.println("사각형의 넓이 : " + r.getArea());
    }
}
