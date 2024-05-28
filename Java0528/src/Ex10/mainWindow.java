package Ex10;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainWindow extends JFrame {

    JLabel label1 = new JLabel("count : 0");
    int counter = 0;

    public mainWindow() {
        setTitle("counter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container container = getContentPane();
        container.setLayout(null);
        container.setSize(640, 480);
        container.add(label1);

        label1.setSize(128, 20);
        label1.setLocation(100, 100);

        JButton add = new JButton("add");
        add.setSize(80, 20);
        add.setLocation(30, 200);
        container.add(add);
        
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label1.setText("count : " + counter);
            }
        });

        JButton sub = new JButton("sub");
        sub.setSize(80, 20);
        sub.setLocation(150, 200);
        container.add(sub);
        
        sub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter--;
                label1.setText("count : " + counter);
            }
        });

        setSize(640, 480);
        setVisible(true);
    }

    public static void main(String[] args) {
        new mainWindow();
    }
}