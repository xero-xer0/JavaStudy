package Ex07;
public class app {
    public static void main(String[] args) {
        
        String strA = "C#";
        String strB = "Java";

        String strC = strA.concat(strB);

        System.out.println(strC);

        System.out.println(strA == strC);
        System.out.println(strA.trim());
        System.out.println(strB.replace("va", "++"));
        
        String strD = new String("apple,banana,mango");
        
        String[]strArr = strD.split(",");
        for (String strItem : strArr) {
            System.out.println(strItem);
    
        }
        
        System.out.println(strD.substring(6, 12));
        System.out.println(strD.charAt(5));
        System.out.println(strD.charAt(11));

    }
}