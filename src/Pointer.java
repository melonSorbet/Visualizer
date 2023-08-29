import javax.swing.*;
import java.awt.*;
import java.util.List;

public class Pointer extends JLabel {
    //Pointer points from one circle to the next one
    List_Node start_node;
    List_Node end_node;
    public Pointer(List_Node start, List_Node end){
        start_node = start;
        end_node = end;
        this.setBounds(0,0, 1080,720);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawLine(start_node.position.x - start_node.radius, start_node.position.y - start_node.radius, end_node.position.x - start_node.radius, end_node.position.y - start_node.radius);
    }


}
