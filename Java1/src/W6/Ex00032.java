package W6;

class Circle {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

public class Ex00032 {
    public static void main(String[] args) {
        Circle[] circleArray;
        circleArray = new Circle[5];
        for (int i = 0; i < 5; i++) {
            circleArray[i] = new Circle(i);
        }
        System.out.printf("%d \n");
    }
}