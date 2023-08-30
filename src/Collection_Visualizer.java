import java.util.LinkedList;
import java.util.List;

public class Collection_Visualizer {
    Frame frame;
    int node_amount;
    LinkedList<Node> node_list;
    int free_space;
    public Collection_Visualizer(List<Integer> list){
        node_list = new LinkedList<>();
        node_amount = list.size() + 1;

        frame = new Frame(1080, 720);


    }
    public void draw_nodes(LinkedList<Integer> list){
        List_Node last = null;
        int q = 1;
        for(int i = frame.getWidth() / node_amount; i < frame.getWidth() - (free_space); i += frame.getWidth() / node_amount){
            List_Node temp = new List_Node(list.get(q - 1), 25, new Position(i, frame.getHeight() / 2));
            if(last != null){
                Pointer pointer = new Pointer(temp, last);
                    frame.add(pointer);
            }

            node_list.add(temp);
            frame.add_component(temp);
            last = temp;
            q++;
        }
    }

    public void add_node(int number){
        //visalize adding of a node
        node_amount++;



    }
    public void remove_node(){
        //visualized removal of a node
    }
    public void Sort(){
        //visualize sorting of nodes
    }



    public static void main(String[] arg){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(3);
        list.add(2);
        list.add(6);
        list.add(9);
        list.add(-2);
        Collection_Visualizer vis = new Collection_Visualizer(list);


        vis.draw_nodes(list);
        vis.frame.set_visible();
    }
    public void Stacks_Queues(){

    }

}
