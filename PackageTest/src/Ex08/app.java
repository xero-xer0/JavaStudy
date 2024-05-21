package Ex08;

public class app {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        StringBuffer _sb = sb.append("World!");
        System.out.println(_sb);
        System.out.println(_sb == sb);
    }
}
