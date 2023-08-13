import javax.swing.*;
import java.awt.*;

public class array_node extends Node{

    JButton button;
    public array_node(int number) {
        super(number);
        button = new JButton();
        button.setText(Integer.toString(number));
    }

    public void switch_buttons(array_node other_node) {
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
