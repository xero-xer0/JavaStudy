package Ex01;

import java.io.*;

public class app {
    public static void main(String[] args) {

        FileReader fin = null;

        try {
            fin = new FileReader("Java0521/src/Ex01/test.txt");
            int c;
            while ((c = fin.read()) != -1) {
                System.out.print((char) c);
            }
            fin.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
            System.out.println(e.getMessage());
        }
    }
}