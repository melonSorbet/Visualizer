import javax.swing.*;
import java.awt.*;
import java.util.List;

public class List_node extends Node{
    JPanel panel;
    int number;
    List_node pre;

    List_node post;
    public List_node(int number) {
        super(number);
        //create label which is connected to its predecessor
        panel = new JPanel();
    }

    @Override
    public void set_color(Color color) {

    }

    @Override
    public void set_number(int number) {

    }
    public void paint(Graphics g){
        g.drawOval(0, 200, 50, 50);

    }
}
