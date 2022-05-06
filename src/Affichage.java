import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class Affichage extends JPanel {

    Map m;
    MoteurGraphique mg;

    CareCelule[] tableauCareCelule;
    public Affichage(Map m, MoteurGraphique mg){
        this.m = m;
        this.mg = mg;

    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        double fenetre_size_x = mg.getSize().getWidth();
        double fenetre_size_y = mg.getSize().getHeight();
        int size_x = m.getSize_x();
        int size_y = m.getSize_y();

        int squareEveryX = (int) (fenetre_size_x / size_x);
        int squareEveryY = (int) (fenetre_size_y / size_y);

        this.tableauCareCelule = new CareCelule[m.getSize_x()*m.getSize_y()];

        int i = 0;
        for (int x=0; x<m.getSize_x();x++) {
            for (int y=0; y<m.getSize_y();y++) {
                tableauCareCelule[i] = new CareCelule((int) (x*squareEveryX), (int) (y*squareEveryY), (int) squareEveryX, (int) squareEveryY,m.get_celule_by_co(x, y).get_etat());
                i++;
            }
        }
        for(CareCelule c : tableauCareCelule) {
            c.paintcelule(g);
        }
    }


}
