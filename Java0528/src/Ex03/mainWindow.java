package Ex03;

import java.awt.*;
import javax.swing.*;

public class mainWindow extends JFrame {
    public mainWindow() {
        setTitle("null Layout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null);

        JLabel label1 = new JLabel("Hello, Press Button");
        label1.setLocation(100, 150);
        label1.setSize(200, 20);
        container.add(label1);

        JLabel label2 = new JLabel("ZeroPoint");
        label2.setLocation(0, 0);
        label2.setSize(200, 20);
        container.add(label2);

        JLabel label3 = new JLabel("CenterPoint");
        label3.setLocation(container.getWidth() / 2, container.getHeight() / 2);
        label3.setSize(200, 20);
        label3.setForeground(new Color(255, 0, 0));
        container.add(label3);

        setSize(640, 480);
        setVisible(true);
    }

    public static void main(String[] args) {
        mainWindow mainWindow = new mainWindow();
    }
}
