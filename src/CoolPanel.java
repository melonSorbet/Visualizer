import javax.swing.*;

public class CoolPanel extends JPanel {



    public CoolPanel() {
        // Initialize the JLabel with the desired text
        JLabel coolLabel = new JLabel("I'm cool");

        // Add the label to the panel
        this.add(coolLabel);
    }


    public static void main(String[] args) {
        // Test the CoolPanel
        JFrame frame = new JFrame("CoolPanel Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);  // width, height

        CoolPanel coolPanel = new CoolPanel();

        frame.add(coolPanel);
        frame.setVisible(true);
    }
}