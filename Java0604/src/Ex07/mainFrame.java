package Ex07;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class mainFrame extends JFrame {

    public class TimerThread extends Thread {
        private JLabel timerLabel;

        public TimerThread(JLabel timerLabel) {
            this.timerLabel = timerLabel;
        }

        @Override
        public void run() {
            int n = 0;
            while (true) {
                timerLabel.setText(Integer.toString(n));
                n++;
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }
    }

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        JLabel timerLabel = new JLabel();
        container.add(timerLabel);

        TimerThread thread = new TimerThread(timerLabel);

        setSize(320, 240);
        setVisible(true);

        JButton startbtn = new JButton("Timer Start");
        container.add(startbtn);

        startbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent n) {
                thread.start();
            }
        });

        JButton stopbtn = new JButton("Timer Stop");
        container.add(stopbtn);

        stopbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent n) {
                thread.interrupt();
            }

        });
    }

    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
    }
}
