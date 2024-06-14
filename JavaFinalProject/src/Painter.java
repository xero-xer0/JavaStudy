import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Painter extends JFrame {
    private DrawArea drawArea;
    private JButton clearButton, colorButton, eraserButton, lineButton, rectButton, ovalButton, saveButton, loadButton,
            freeformButton;
    private JSpinner lineThicknessSpinner, eraserSizeSpinner;
    private Color currentColor = Color.BLACK;
    private String currentTool = "Freeform";
    private int startX, startY;
    private int lineThickness = 1;
    private int eraserSize = 10;

    public Painter() {
        setTitle("Painter");
        setSize(1200, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawArea = new DrawArea();
        add(drawArea, BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        colorButton = new JButton("색상");
        colorButton.addActionListener(e -> chooseColor());
        controlPanel.add(colorButton);

        freeformButton = new JButton("펜");
        freeformButton.addActionListener(e -> setCurrentTool("Freeform"));
        controlPanel.add(freeformButton);

        lineButton = new JButton("직선");
        lineButton.addActionListener(e -> setCurrentTool("Line"));
        controlPanel.add(lineButton);

        rectButton = new JButton("직사각형");
        rectButton.addActionListener(e -> setCurrentTool("Rectangle"));
        controlPanel.add(rectButton);

        ovalButton = new JButton("타원");
        ovalButton.addActionListener(e -> setCurrentTool("Oval"));
        controlPanel.add(ovalButton);

        eraserButton = new JButton("지우개");
        eraserButton.addActionListener(e -> setCurrentTool("Eraser"));
        controlPanel.add(eraserButton);

        controlPanel.add(new JLabel("선 두께 "));
        lineThicknessSpinner = new JSpinner(new SpinnerNumberModel(1, 1, 20, 1));
        lineThicknessSpinner.addChangeListener(e -> lineThickness = (int) lineThicknessSpinner.getValue());
        controlPanel.add(lineThicknessSpinner);

        controlPanel.add(new JLabel("지우개 크기"));
        eraserSizeSpinner = new JSpinner(new SpinnerNumberModel(10, 1, 50, 1));
        eraserSizeSpinner.addChangeListener(e -> eraserSize = (int) eraserSizeSpinner.getValue());
        controlPanel.add(eraserSizeSpinner);

        saveButton = new JButton("저장");
        saveButton.addActionListener(e -> saveImage());
        controlPanel.add(saveButton);

        loadButton = new JButton("열기");
        loadButton.addActionListener(e -> loadImage());
        controlPanel.add(loadButton);

        clearButton = new JButton("전체 삭제");
        clearButton.addActionListener(e -> drawArea.clear());
        controlPanel.add(clearButton);

        add(controlPanel, BorderLayout.NORTH);

        addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                drawArea.resizeImage(getWidth(), getHeight());
            }
        });

        // Set default selected tool
        setCurrentTool("Freeform");
    }

    private void chooseColor() {
        Color newColor = JColorChooser.showDialog(this, "Choose Color", currentColor);
        if (newColor != null) {
            currentColor = newColor;
            setCurrentTool("Freeform");
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

    private void setCurrentTool(String tool) {
        currentTool = tool;
        updateButtonStyles();
    }

    private void updateButtonStyles() {
        JButton[] buttons = { freeformButton, lineButton, rectButton, ovalButton, eraserButton };
        for (JButton button : buttons) {
            if (button.getText().equals(getToolName(currentTool))) {
                button.setFont(button.getFont().deriveFont(Font.ITALIC));
            } else {
                button.setFont(button.getFont().deriveFont(Font.PLAIN));
            }
        }
    }

    private String getToolName(String tool) {
        switch (tool) {
            case "Freeform":
                return "펜";
            case "Line":
                return "직선";
            case "Rectangle":
                return "직사각형";
            case "Oval":
                return "타원";
            case "Eraser":
                return "지우개";
            default:
                return "";
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
            clear();

            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    prevX = e.getX();
                    prevY = e.getY();
                    startX = e.getX();
                    startY = e.getY();
                    drawPoint(startX, startY);
                }

                public void mouseReleased(MouseEvent e) {
                    g2.setStroke(new BasicStroke(lineThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
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

                    g2.setStroke(new BasicStroke(lineThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                    if (currentTool.equals("Freeform")) {
                        g2.setPaint(currentColor);
                        g2.drawLine(prevX, prevY, x, y);
                    } else if (currentTool.equals("Eraser")) {
                        g2.setPaint(Color.white);
                        g2.setStroke(new BasicStroke(eraserSize, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
                        g2.drawLine(prevX, prevY, x, y);
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

        public void resizeImage(int newWidth, int newHeight) {
            if (newWidth > 0 && newHeight > 0) {
                BufferedImage newImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_ARGB);
                Graphics2D g2d = newImage.createGraphics();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setPaint(Color.white);
                g2d.fillRect(0, 0, newWidth, newHeight);
                g2d.drawImage(image, 0, 0, null);
                g2d.dispose();
                image = newImage;
                g2 = image.createGraphics();
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                repaint();
            }
        }

        private void drawPoint(int x, int y) {
            g2.setStroke(new BasicStroke(lineThickness, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
            g2.setPaint(currentColor);
            g2.drawLine(x, y, x, y);
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