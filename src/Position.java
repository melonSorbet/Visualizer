public class Position {
    public int x;
    public int y;

    public Position(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Position(Position position){
        this.x = position.x;
        this.y = position.y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


}
