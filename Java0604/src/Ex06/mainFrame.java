package Ex06;

import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    public class MyPanel extends JPanel {

        private ImageIcon callBtn = new ImageIcon("src/Ex02/callbtn.png");
        private Image img = callBtn.getImage();

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 10, 10, 32,32, this);
            g.drawImage(img, 50,10,100,100,250,200,150,100, this);

        }
    }

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container container = getContentPane();
        setContentPane(new MyPanel());

        setSize(600, 600);
        setVisible(true);

    }

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();

    }
}
