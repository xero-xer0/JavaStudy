package Ex02;

import java.io.*;

public class app {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        int ch;
        try {
            fin = new FileInputStream("Java0521/Hangul.txt");
            in = new InputStreamReader(fin, "UTF-8");
            System.out.println("encoding set : " + in.getEncoding());
            while ((ch = in.read()) != -1) {
                System.out.print((char) ch);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
