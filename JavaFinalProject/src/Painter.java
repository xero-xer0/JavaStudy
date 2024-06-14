import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Painter extends JFrame {
    private DrawArea drawArea;
    private JButton clearButton, colorButton, eraserButton, lineButton, rectButton, ovalButton, saveButton, loadButton;
    private Color currentColor = Color.BLACK;
    private String currentTool = "Brush";
    private int startX, startY, endX, endY;

    public Painter() {
        setTitle("Painter");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawArea = new DrawArea();
        add(drawArea, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        clearButton = new JButton("Clear");
        clearButton.addActionListener(e -> drawArea.clear());
        controlPanel.add(clearButton);

        colorButton = new JButton("Color");
        colorButton.addActionListener(e -> chooseColor());
        controlPanel.add(colorButton);

        eraserButton = new JButton("Eraser");
        eraserButton.addActionListener(e -> currentTool = "Eraser");
        controlPanel.add(eraserButton);

        lineButton = new JButton("Line");
        lineButton.addActionListener(e -> currentTool = "Line");
        controlPanel.add(lineButton);

        rectButton = new JButton("Rectangle");
        rectButton.addActionListener(e -> currentTool = "Rectangle");
        controlPanel.add(rectButton);

        ovalButton = new JButton("Oval");
        ovalButton.addActionListener(e -> currentTool = "Oval");
        controlPanel.add(ovalButton);

        saveButton = new JButton("Save");
        saveButton.addActionListener(e -> saveImage());
        controlPanel.add(saveButton);

        loadButton = new JButton("Load");
        loadButton.addActionListener(e -> loadImage());
        controlPanel.add(loadButton);

        add(controlPanel, BorderLayout.NORTH);
    }

    private void chooseColor() {
        Color newColor = JColorChooser.showDialog(this, "Choose Color", currentColor);
        if (newColor != null) {
            currentColor = newColor;
            currentTool = "Brush";
        }
    }

    private void saveImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save Image");
        int userSelection = fileChooser.showSaveDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                ImageIO.write(drawArea.getImage(), "png", fileToSave);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void loadImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Load Image");
        int userSelection = fileChooser.showOpenDialog(this);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToLoad = fileChooser.getSelectedFile();
            try {
                BufferedImage loadedImage = ImageIO.read(fileToLoad);
                drawArea.setImage(loadedImage);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private class DrawArea extends JPanel {
        private BufferedImage image;
        private Graphics2D g2;
        private int x, y, prevX, prevY;

        public DrawArea() {
            setDoubleBuffered(false);
            image = new BufferedImage(800, 600, BufferedImage.TYPE_INT_ARGB);
            g2 = image.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setPaint(Color.white);
            g2.fillRect(0, 0, 800, 600);
            g2.setPaint(Color.black);

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                    startX = e.getX();
                    startY = e.getY();
                }

                public void mouseReleased(MouseEvent e) {
                    if (currentTool.equals("Line")) {
                        g2.setPaint(currentColor);
                        g2.drawLine(startX, startY, e.getX(), e.getY());
                    } else if (currentTool.equals("Rectangle")) {
                        g2.setPaint(currentColor);
                        g2.drawRect(Math.min(startX, e.getX()), Math.min(startY, e.getY()),
                                Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
                    } else if (currentTool.equals("Oval")) {
                        g2.setPaint(currentColor);
                        g2.drawOval(Math.min(startX, e.getX()), Math.min(startY, e.getY()),
                                Math.abs(e.getX() - startX), Math.abs(e.getY() - startY));
                    }
                    repaint();
                }
            });

            addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    x = e.getX();
                    y = e.getY();

                    if (currentTool.equals("Brush")) {
                        g2.setPaint(currentColor);
                        g2.drawLine(prevX, prevY, x, y);
                    } else if (currentTool.equals("Eraser")) {
                        g2.setPaint(Color.white);
                        g2.setStroke(new BasicStroke(10));
                        g2.drawLine(prevX, prevY, x, y);
                        g2.setStroke(new BasicStroke(1));
                    }

                    prevX = x;
                    prevY = y;
                    repaint();
                }
            });
        }

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(image, 0, 0, null);
        }

        public void clear() {
            g2.setPaint(Color.white);
            g2.fillRect(0, 0, getWidth(), getHeight());
            g2.setPaint(Color.black);
            repaint();
            currentTool = "Brush";
        }

        public BufferedImage getImage() {
            return image;
        }

        public void setImage(BufferedImage image) {
            this.image = image;
            g2 = this.image.createGraphics();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            repaint();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Painter app = new Painter();
            app.setVisible(true);
        });
    }
}