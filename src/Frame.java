import javax.swing.*;

public class Frame {
    JFrame frame;
    public Frame(){
        frame = new JFrame();
        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(500, 500);
    }
    public void set_visible(){
        frame.setVisible(true);
    }
    public void set_size(int widght, int height){
        frame.setSize(widght, height);
    }
    public void add_component(List_Node new_node){

        frame.add(new_node);
    }

}
