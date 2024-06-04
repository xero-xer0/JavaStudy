package Ex05;

import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    class MyPanel extends JPanel {

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            g.setColor(Color.BLUE);
            g.drawRect(10,10,150,150);

            g.setColor(Color.RED);
            g.drawLine(10,10,160,160);

            g.setColor(Color.GREEN);
            g.drawOval(10,10,150,150);

            g.setColor(Color.CYAN);
            g.drawArc(160,50,80,80,90,-90);
            g.fillArc(160,50,80,80,90,-90);
            
        }

    }


    private MyPanel myPanel = new MyPanel();
    

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Container container = getContentPane();
        setContentPane(myPanel);

        setSize(320, 240);
        setVisible(true);

    }

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();

    }
}
