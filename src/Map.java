import java.util.Random;

public class Map {
    int size_x;
    int size_y;
    Celule[][] tableau_celul;

    public Map(int size_x, int size_y)
    {
        Random rd = new Random();
        tableau_celul = new Celule[size_x][size_y];
        for (int x=0; x<size_x;x++) {
            for (int y=0; y<size_y;y++) {
                tableau_celul[x][y] = new Celule(rd.nextBoolean(), x, y);
            }
        }
        this.size_x = size_x;
        this.size_y = size_y;
    }

    public boolean celul_exist(int x, int y){
        if((x < this.size_x)&&(y < this.size_y)&&(x >= 0)&&(y >= 0)){
            return true;
        }
        else{
            return false;
        }
    }

    public Celule get_celule_by_co(int x,int  y) {
        return this.tableau_celul[x][y];
    }

    public void map_update(){
        for (int x=0; x<this.size_x;x++) {
            for (int y=0; y<this.size_y;y++) {
                tableau_celul[x][y].pre_update(this);
            }
        }
        for (int x=0; x<this.size_x;x++) {
            for (int y=0; y<this.size_y;y++) {
                tableau_celul[x][y].update();
            }
        }
    }

    public void print_map(){
        String ligne = "";
        boolean etat_celule;
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\\n\n\n\n\n\n\n\n\n\n");
        for (int x=0; x<this.size_x;x++) {
            for (int y=0; y<this.size_y;y++) {
                etat_celule = tableau_celul[x][y].get_etat();
                if (etat_celule == true){
                    ligne = ligne + "[X]";
                }else {
                    ligne = ligne + "[ ]";
                }
            }
            System.out.println(ligne + "\n");
            ligne = "";
        }
    }

    public int getSize_x(){
        return this.size_x;
    }

    public int getSize_y(){
        return this.size_y;
    }
}