import javax.swing.*;
import java.awt.*;

public abstract class Node {


    //number ist der index
    int number;
    public Node(int number){
        this.number = number;
    }



    public abstract void set_color(Color color);

    public abstract void set_number(int number);


}
