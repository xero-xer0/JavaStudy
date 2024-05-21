
public class Ex00029_Circle{
    String name = "circle";
    int radius;
    public Ex00029_Circle() {}
    public double getArea() {
        return 3.14*radius*radius;
    }
    public Ex00029_Circle(int r, String n) {
        radius = r;
        name = n;
    }
    public static void main(String[] args) {
        Ex00029_Circle pizza;
        pizza = new Ex00029_Circle();
        pizza.radius = 10;
        pizza.name = "자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");

        Ex00029_Circle donut = new Ex00029_Circle();
        donut.radius = 10;
        int innerradius = 1;
        donut.name = "자바도넛";
        double outerarea = donut.getArea();
        double innerarea = innerradius*innerradius*3.14;
        double donutarea = outerarea-innerarea;
        
        System.out.println(donut.name + "의 면적은 " + donutarea + "입니다.");
    }
}
