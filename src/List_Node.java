import javax.swing.*;
import java.awt.*;

public class List_Node extends Node{
    JPanel panel;
    int number;
    List_Node pre;
    List_Node post;
    Position position;
    int radius;
    public List_Node(int number, int radius, Position position) {
        super(number);

        this.radius = radius;
        this.position = position;

        this.setBounds((position.x) - (radius / 2), (position.y - 25) - (radius / 2),radius +1,radius +1);

        //position ist gerade nur obere rechte ecke

        JLabel label = new JLabel(Integer.toString(number));
        this.setLayout(new BorderLayout());
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setSize(100,100);

        this.add(label);

    }

    public void set_color(Color color) {

    }


    public void set_number(int number) {

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //g.drawOval((position.x) - (radius / 2), (position.y - 25) - (radius / 2),radius,radius);

        g.drawOval(0,0,radius, radius);


    }

    public static void main(String[] arg){
        Frame frame = new Frame(700, 700);

        List_Node node = new List_Node(1, 100, new Position(50, 350));
        Pointer pointer = new Pointer(new Position(50,200), new Position(250,350));
        frame.frame.add(node);
        frame.frame.add(pointer);
        List_Node node2 = new List_Node(2, 100, new Position(250, 350));



        frame.frame.add(node2);



        frame.set_visible();




    }

}

