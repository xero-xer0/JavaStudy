package Ex04;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class MyActionListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        JButton targetBtn = (JButton) e.getSource();
        targetBtn.setText("Clicked");
    }
}

public class mainWindow extends JFrame {
    public mainWindow() {
        setTitle("GridLayout");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        container.add(btn);

        setSize(320, 240);
        setVisible(true);
    }

    public static void main(String[] args) {
        mainWindow mainWindow = new mainWindow();
    }
}
