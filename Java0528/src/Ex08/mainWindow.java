package Ex08;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainWindow extends JFrame {

    JLabel label1 = new JLabel("mouse pos : ");

    public mainWindow() {
        setTitle("mouse event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
        setSize(640,480);

        Container container = getContentPane();
        container.setLayout(null);        
        label1.setSize(128,20);
        label1.setLocation(30,30);

        container.add(label1);

        container.addMouseListener(
            new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {                
                    label1.setText( e.getX() + "," + e.getY());
                }
            }
        );

        setVisible(true);
    }

    public static void main(String[] args) {
        mainWindow _wnd = new mainWindow();
        
    }
}