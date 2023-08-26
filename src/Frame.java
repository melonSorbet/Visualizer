import javax.swing.*;
import java.awt.*;

public class Frame {
    JFrame frame;
    public Frame(int x, int y){
        frame = new JFrame();
        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setSize(x, y);
        frame.setLayout(null);

    }
    public void set_visible(){
        frame.setVisible(true);
    }
    public void set_size(int widght, int height){
        frame.setSize(widght, height);
    }
    public void add_component(Node new_node){

        frame.add(new_node);
    }
    public void add_component(Pointer pointer){

    }

}
