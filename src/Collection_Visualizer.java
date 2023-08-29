import java.util.LinkedList;
import java.util.List;

public class Collection_Visualizer {
    Frame frame;
    int node_amount;
    LinkedList<Node> node_list;
    int free_space;
    public Collection_Visualizer(){
        node_list = new LinkedList<>();
        node_amount = 12;
        List_Node last = null;
        this.frame = new Frame(1080, 720);
        for(int i = frame.getWidth() / node_amount; i < frame.getWidth() - (free_space); i += frame.getWidth() / node_amount){
            List_Node temp = new List_Node(1, 25, new Position(i, frame.getHeight() / 2));
            if(last != null){
                Pointer pointer = new Pointer(temp, last);
                frame.add(pointer);
            }

            node_list.add(temp);
            frame.add_component(temp);
            last = temp;
        }
    }

    public void add_node(int number){
        node_amount++;
        frame.add_component(new List_Node(number, 25, new Position(frame.getWidth() / node_amount, frame.getHeight() / 2)));

        frame.repaint();
    }
    public void remove_node(){

    }
    public void Sort(){

    }



    public static void main(String[] arg){
        Collection_Visualizer vis = new Collection_Visualizer();


        vis.frame.set_visible();
    }
    public void Stacks_Queues(){

    }

}
