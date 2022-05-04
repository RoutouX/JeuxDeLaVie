public class position2D {

    private int pos_x = 0;
    private int pos_y = 0;

    public void position2D(int pos_x, int pos_y){
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    public int get_x(){
        return this.pos_x;
    }

    public int get_y(){
        return this.pos_y;
    }

    public void set_x(int x){
        this.pos_x = x;
    }

    public void set_y(int y){
        this.pos_x = y;
    }
}
