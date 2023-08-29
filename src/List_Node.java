import javax.swing.*;
import java.awt.*;

public class List_Node extends Node {


    List_Node pre;
    List_Node post;
    public Position position;
    int radius;

    public List_Node(int number, int radius, Position position) {
        super(number);
        this.radius = radius;
        this.position = position;

        //no Layout-manager -> set Bounds seperatly for every JComponent
        this.setBounds(position.x - radius, position.y - radius - 25, radius * 2 + 1, radius * 2 + 1);


        //label for number/text
        JLabel label = new JLabel(Integer.toString(number), JLabel.CENTER);
        this.setLayout(new BorderLayout());

        //label.setVerticalAlignment(JLabel.CENTER);
        //label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(radius, radius);

        this.add(label);

    }

    @Override
    public void set_color(Color color) {

    }

    @Override
    public void set_number(int number) {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


        g.drawOval(0, 0, radius * 2, radius * 2);


    }


    public static void main(String[] arg) {
        Frame frame = new Frame(700, 700);

        List_Node node = new List_Node(1, 25, new Position(50, frame.getHeight() / 2));


        List_Node node2 = new List_Node(2, 25, new Position(250, frame.getWidth() / 2));
        Pointer pointer = new Pointer(node, node2);
        frame.add_component(node2);
        frame.add_component(node);
        frame.add_component(pointer);
        frame.set_visible();


    }

}

