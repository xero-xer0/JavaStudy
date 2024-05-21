package Ex08;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame{
    public MainFrame() {
        setTitle("Hello, World!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JButton btn1 = new JButton("Hello");
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton btn = (JButton)e.getSource();
                btn.setText("World");
            }
        });
        c.add(btn1);
        setSize(320, 240);
        setVisible(true);

    }
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
    }
}
