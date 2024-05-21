package Ex06;

import java.io.*;
import java.util.*;

public class app {
    public static void main(String[] args) {
        File path = new File("./");
        System.out.println(path.getAbsolutePath());

        File[] subFiles = path.listFiles();
        for (File file : subFiles) {
            long t = file.lastModified();
            if (file.isDirectory()) {
                System.out.println("[" + file.getName() + "]");
            } else {
                System.out.printf("%tb %td %ta %tT \n", t,t,t,t);
                System.out.println(file.getName() + "\t" + file.length()+" bytes");
            }
        }
    }
}
