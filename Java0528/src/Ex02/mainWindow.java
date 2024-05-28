package Ex02;
import java.awt.*;
import javax.swing.*;
public class mainWindow extends JFrame{
    public mainWindow() {
        setTitle("Grid Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4, 2);
        grid.setVgap(5);
        Container container = getContentPane();
        container.setLayout(grid);

        container.add(new JLabel("이름"));
        container.add(new JTextField());

        container.add(new JLabel("학번"));
        container.add(new JTextField());

        container.add(new JLabel("학과"));
        container.add(new JTextField());

        container.add(new JLabel("과목"));
        container.add(new JTextField());

        setSize (320, 240);
        setVisible(true);
    }
    public static void main(String[] args) {
        mainWindow mainWindow = new mainWindow();
    }
}
