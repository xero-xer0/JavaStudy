package Ex05;

import java.io.*;

public class app {
    public static void main(String[] args) {

        FileReader fin = null;

        try {
            fin = new FileReader("test2.txt");
            int c;
            int count = 0;
            BufferedOutputStream out = new BufferedOutputStream(System.out, 4);
            while ((c = fin.read()) != -1) {
                out.write(c);
                // System.out.print((char) c);
                // count++;
                // if(count>4)break;
            }
            System.out.println("-----------------");
            fin.close();
            out.flush();
            out.close();
        } catch (IOException e) {
            System.out.println("입출력 오류");
            System.out.println(e.getMessage());
        }
    }
}