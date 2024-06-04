package Ex04;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class mainFrame extends JFrame {
    
    private JTextField tf = new JTextField();
    private JTextArea ta = new JTextArea();

    public mainFrame() {

        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        container.add(new JLabel("입력 후 <Enter> 키를 입력하세요 \n"));

        container.add(tf);
        container.add(ta);

        tf.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JTextField tf = (JTextField)e.getSource();
                    System.out.println(tf.getText());
                    ta.append(tf.getText() + "\n");
                }
            }
        );


        setSize(200, 240);
        setVisible(true);
        
    }
    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();

    }
}
