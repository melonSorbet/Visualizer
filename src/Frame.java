import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    int x;
    int y;
    public Frame(int x, int y) {
        this.x = x;
        this.y = y;
        this.setTitle("Visualizer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setSize(x, y);
        this.setLayout(null);
    }

    public void set_visible() {
        this.setVisible(true);
    }



    public void add_component(JComponent new_node) {
        this.add(new_node);
    }


}
