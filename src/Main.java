import javax.swing.*;
import java.awt.event.*;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ActionListener lall= e -> System.out.println("hello loser");


        Timer timer = new Timer(1000, lall);

        timer.start();
        timer.start();

        JOptionPane.showMessageDialog(null, "Click to exit program");
        System.exit(0);



    }
}
