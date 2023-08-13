import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.LinkedList;

public class Frame {
    JFrame frame;
    arrays_visualizer array_vis;
    public Frame(int[] array){

        frame = new JFrame();
        array_vis = new arrays_visualizer(array, frame);
        array_vis.create_buttons();


        frame.setTitle("Visualizermenu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);


    }



    public static void main(String[] args){
        Frame frame = new Frame(new int[]{123,1,221,4,54,51,23,12});

        frame.frame.setVisible(true);
        frame.array_vis.visualizer();

    }
}
