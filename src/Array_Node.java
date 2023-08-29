import javax.swing.*;
import java.awt.*;

public class Array_Node extends Node{
    //alles wird hier umgeändert weil buttons unpraktisch sind
    JButton button;
    public Array_Node(int number) {
        super(number);
        button = new JButton();
        button.setText(Integer.toString(number));
    }

    public void switch_buttons(Array_Node other_node) {
        String string = other_node.button.getText();
        other_node.button.setText(button.getText());
        button.setText(string);
    }

    public void set_color(Color color){
        button.setBackground(color);
        button.setOpaque(true);
    }

    public void set_number(int number){
        button.setText(Integer.toString(number));
        this.number = number;
    }


}
