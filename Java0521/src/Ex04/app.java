package Ex04;

import java.io.*;

public class app {
    static void saveTest() {
        byte b[] = { 7, 51, 3, 4, -1, 24 };
        try {
            FileOutputStream fos = new FileOutputStream("test.out");
            for (int i = 0; i < b.length; i++) {
                fos.write(b[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("save OK!");
    }

    static void loadTest() {
        byte b[] = new byte[6];
        try {
            FileInputStream fis = new FileInputStream("test.out");
            for (int i = 0; i < b.length; i++) {
                int ch = fis.read();
                b[i] = (byte) ch;

            }
            fis.close();
            System.out.println("load OK!");
            for (int i = 0; i < b.length; i++) {
                System.out.println(b[i]);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        // saveTest();
        loadTest();
    }
}