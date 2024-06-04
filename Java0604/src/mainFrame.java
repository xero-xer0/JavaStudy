
import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();

        setSize(320, 240);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();

    }
}
