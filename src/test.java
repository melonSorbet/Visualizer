import javax.swing.*;
import java.awt.*;
public class test extends JPanel{
    int panelsizey;
    int panelsizex;

    int circleradius;
    public static void main(String[] args){

        JFrame frame = new JFrame();

        frame.setLayout(new GridLayout());
        List_node list_node = new List_node(2);
        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setResizable(false);
        test Test = new test();
        test eest = new test();
        test ceest = new test();
        frame.add(ceest);
        frame.add(Test);
        frame.add(eest);
        test feest = new test();
        frame.add(feest);
        test keest = new test();
        frame.add(keest);
        frame.setVisible(true);

    }
    public void paint(Graphics g){
        g.drawLine(50, 225, 200, 225);
        g.drawOval(0,200, 50, 50);

    }

}
