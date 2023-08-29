import javax.swing.*;
import java.awt.*;

public class CirclePanel extends JPanel {
    private final JLabel numberLabel;
    private final Dimension preferredSize;

    public CirclePanel(int number, int width, int height) {
        setLayout(new GridBagLayout()); // This layout will center the JLabel in the panel
        // Set the preferred size and number label
        preferredSize = new Dimension(width, height);
        numberLabel = new JLabel(String.valueOf(number));

        add(numberLabel);
        setOpaque(false); // So that the circle can be seen
    }

    @Override
    public Dimension getPreferredSize() {
        return preferredSize;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int radius = Math.min(getWidth(), getHeight()) / 2;
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g.drawOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Circle with Centered Number");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout()); // Using FlowLayout for simplicity

        CirclePanel circlePanel = new CirclePanel(5, 200, 200);
        frame.add(circlePanel);

        frame.setVisible(true);
    }
}