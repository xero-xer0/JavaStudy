package W7;

abstract class Calculator {
    public abstract int add(int a, int b);
    public abstract int sub(int a, int b);
}
public class Ex00042 extends Calculator {
    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Ex00042 myCal = new Ex00042();
        System.out.println(myCal.add(1,2));
        System.out.println(myCal.sub(5,2));
    }
}
