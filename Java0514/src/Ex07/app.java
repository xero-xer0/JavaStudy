package Ex07;

import java.awt.*;
import javax.swing.*;

public class app extends JFrame {
    public app() {

        setTitle("JFrame_Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JButton("OK"));
        c.add(new JButton("Cancel"));
        c.add(new JButton("Ignore"));

        setSize(300, 300);
        setLocation(100, 100);
        setVisible(true);

    }

    public static void main(String[] args) {
        app app = new app();

    }
}
