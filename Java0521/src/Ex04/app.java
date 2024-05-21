package Ex04;
import java.io.*;
public class app {
    public static void main(String[] args) {
        byte b[] = {7, 51, 3, 4, -1, 24};
        try{
            FileOutputStream fos = new FileOutputStream("test.out");
            for(int i = 0; i < b .length; i++){
                fos.write(b[i]);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("save OK!");
    }
}
