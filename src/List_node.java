import javax.swing.*;
import java.awt.*;

public class List_node extends Node{
    JPanel panel;
    int number;
    List_node pre;
    List_node post;
    Position position;
    int radius;
    public List_node(int number, int radius, Position position) {
        super(number);
        this.radius = radius;
        this.position = position;
        this.setBounds(position.x, position.y, radius,radius);
        JLabel frame = new JLabel();

        frame.setBounds(50,50,50,50);
        frame.setText("asdasd");

        this.add(frame);
    }

    @Override
    public void set_color(Color color) {

    }

    @Override
    public void set_number(int number) {

    }
    public void paint(Graphics g){
        g.drawOval(0,0,radius,radius);
    }

    public static void main(String[] arg){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout());
        List_node list_node = new List_node(2, 100, new Position(100, 100));
        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        frame.add(list_node);

        frame.setVisible(true);
    }

}

