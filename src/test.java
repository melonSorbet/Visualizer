import javax.swing.*;
import java.awt.*;

public class test extends JPanel{
    int panelsizey;
    int panelsizex;
    public static void main(String[] args){

        JFrame frame = new JFrame();
        List_node list_node = new List_node(2);
        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        test Test = new test();

        frame.add(Test);

        frame.setVisible(true);

    }
    public void paint(Graphics g){
        setSize(panelsizex,panelsizex);
       g.drawOval(225,200, 50, 50);
       
    }

}
