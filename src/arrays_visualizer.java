import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.io.*;
import java.lang.Thread;
public class arrays_visualizer{
    Node[] node_array;
    int[] array;

    int[] done_array;

    JFrame frame;
    public arrays_visualizer(int[] array, JFrame frame){
        this.frame = frame;
        this.array = array;
        done_array = array;
    }
    public void create_buttons(){
        //wird geändert das es Panels macht
        node_array = new Node[array.length];
        frame.setLayout(new GridLayout());
        for(int i = 0; i < array.length; i++){
            array_node node = new array_node(array[i]);
            node.button.setText(node.button.getText());
            node_array[i] = node;
            frame.add(node.button);
        }
        node_array[0].set_color(Color.GREEN);
    }

    public void visualizer(){

        int n = array.length;
        for (int i = 1; i < n; i++) {

            int key = node_array[i].number;
            int j = i - 1;

            while (j >= 0 && node_array[j].number > key) {
                node_array[j + 1].set_number(node_array[j].number);


                try {
                    Thread.sleep(1000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                j--;

            }

            node_array[j + 1].set_number(key);



        }
        System.out.println(Arrays.toString(array));


    }

}
