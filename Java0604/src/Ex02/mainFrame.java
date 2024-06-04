package Ex02;

import java.awt.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        Container container = getContentPane();

        ImageIcon callBtn = new ImageIcon("src/Ex02/callbtn.png");
        JLabel imgLabel = new JLabel(callBtn);
        container.add(imgLabel);

        JButton imgbtn = new JButton("Call", callBtn);
        container.add(imgbtn);


        setSize(600, 1200);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
    }
}
