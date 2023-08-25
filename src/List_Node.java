import javax.swing.*;
import java.awt.*;

public class List_Node extends JPanel{
    JPanel panel;
    int number;
    List_Node pre;
    List_Node post;
    Position position;
    int radius;
    public List_Node(int number, int radius, Position position) {


        this.radius = radius;
        this.position = position;

        //position ist gerade nur obere rechte ecke
        this.setBounds((position.x) - (radius / 2), (position.y - 25) - (radius / 2),radius,radius);
        JLabel label = new JLabel(Integer.toString(number), JLabel.CENTER);


        this.add(label);
    }


    public void set_color(Color color) {

    }


    public void set_number(int number) {

    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawOval((position.x) - (radius / 2), (position.y - 25) - (radius / 2),radius,radius);

    }

    public static void main(String[] arg){
        Frame frame = new Frame();
        List_Node node = new List_Node(2, 50, new Position(250, 250));

        frame.frame.add(node);

        frame.set_visible();




    }

}

