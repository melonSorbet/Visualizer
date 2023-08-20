import java.awt.*;

public class pointer {
    //pointer points from one circle to the next one
    Position start_point;
    Position end_point;
    public pointer(Position start, Position end){
        start_point = start;
        end_point = end;
    }
    public void paint(Graphics g){
        g.drawLine(start_point.x, start_point.y, end_point.x, end_point.y);
    }


}
