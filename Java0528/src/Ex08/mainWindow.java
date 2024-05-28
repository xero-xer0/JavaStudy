package Ex08;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainWindow extends JFrame {
    
    public mainWindow() {
        setTitle("Keyboard event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);

        Container container = getContentPane();
        container.setLayout(null);
        container.setSize(640,480);
        JLabel label1 = new JLabel("key char : ");
        label1.setSize(128,20);
        label1.setLocation(30,30);
        container.add(label1);

        container.addKeyListener(new KeyAdapter(){
            @Override
            public void keyPressed(KeyEvent e) {
                label1.setText("key char : " + e.getKeyChar() + "," + e.getKeyCode());

            }
        });

        setVisible(true);
    }
    
    public static void main(String[] args) {
        mainWindow mainWindow = new mainWindow();
    }
}
