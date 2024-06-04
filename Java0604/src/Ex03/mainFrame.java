package Ex03;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class mainFrame extends JFrame {

    public mainFrame() {
        setTitle("Base Template");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        
        JCheckBox chk_Apple = new JCheckBox("Apple");
        JCheckBox chk_Pear = new JCheckBox("Pear");
        JCheckBox chk_Cherry = new JCheckBox("Cherry");
        JLabel status = new JLabel();
        
        
        chk_Apple.setSelected(true);
        chk_Apple.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED) {
                    status.setText("Apple Checked");
                }
                else {
                    status.setText("Apple Unchecked");
                }
                // status.setText("Item : 사과");
            }
        });
        
        
        setSize(300, 300);
        setVisible(true);
        
        container.add(chk_Apple);
        container.add(chk_Pear);
        container.add(chk_Cherry);
        container.add(status);
    }
    public static void main(String[] args) {
        mainFrame mainFrame = new mainFrame();
    }
}
