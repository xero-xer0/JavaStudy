package Ex01;

import java.awt.*;
import javax.swing.*;

public class app extends JFrame {
    public app() {
        setTitle("BordLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new BorderLayout(30,20));

        container.add(new JButton("center"), BorderLayout.CENTER);
        container.add((new JButton("North")), BorderLayout.NORTH);
        container.add((new JButton("South")), BorderLayout.SOUTH);
        container.add((new JButton("East")), BorderLayout.EAST);
        container.add((new JButton("West")), BorderLayout.WEST);

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        app app = new app();
    }
}