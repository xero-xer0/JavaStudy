package Ex06;

public class app {
    public static void main(String[] args) {
        String strA = "apple";
        String strB = "banana";
        String strC = new String("apple");

        int res = strA.compareTo(strB);

        System.out.println(strA.compareTo(strB)); // -1
        System.out.println(strB.compareTo(strA)); // 1
        System.out.println(strA.compareTo(strC)); // 0
        System.out.println(strC.equals(strB));
        System.out.println(strC.equals(strA));
        System.out.println(strC == strA);
    }
}
