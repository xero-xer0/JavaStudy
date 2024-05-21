public class Ex00010 {
    public static void main(String[] args) {
        int a = 3;
        int b = 7;

        System.out.println(a < b);
        System.out.println(a > b);

        int age = 27;
        System.out.println("20대가 맞나요? " + (age > 20 && age < 30));
        String strName = "lee";
        System.out.println(strName == "lee");
        System.out.println(strName == "kim");

        String strResult = a > b ? "a가 크다" : "b가 크다";
        System.out.println(strResult);
    }
}
