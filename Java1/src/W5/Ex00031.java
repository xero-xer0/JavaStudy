public class Ex00031 {
    public static void main(String[] args) {
        Ex00029_Circle circle = new Ex00029_Circle();
        System.out.println(circle.name + "의 면적은 " + circle.getArea() + "입니다.");

        Ex00029_Circle circle2 = new Ex00029_Circle(5,"circle2");
        System.out.println(circle2.name + "의 면적은 " + circle2.getArea() + "입니다.");
    }
}