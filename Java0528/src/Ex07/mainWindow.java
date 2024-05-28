package Ex07;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainWindow extends JFrame {
    JLabel label1 = new JLabel("Mouse Pos : ");

    public mainWindow() {
        setTitle("mouse event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(640, 480);

        Container container = getContentPane();
        container.setLayout(null);
        container.setSize(640,480);

        label1.setSize(128,20);
        label1.setLocation(30,30);
        container.add(label1);

        container.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                label1.setText(e.getX() + "," + e.getY());
            }

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {}

            @Override
            public void mouseExited(MouseEvent e) {}
        });
        setSize(128,20);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        mainWindow mainWindow = new mainWindow();
    }
}
