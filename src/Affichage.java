import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class Affichage extends JPanel {

    Map m;
    MoteurGraphique mg;

    CareCelule[][] tblCareeClule;
    public Affichage(Map m, MoteurGraphique mg){
        this.m = m;
        this.mg = mg;

    }

    public void squaretbl(){
        tblCareeClule = new CareCelule[m.getSize_x()][m.getSize_y()];
        for (int x=0; x<m.getSize_x();x++) {
            for (int y=0; y<m.getSize_y();y++) {
                tblCareeClule[x][y] = new CareCelule(0, 0, 0, 0, false);
            }
        }
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        double fenetre_size_x = mg.getSize().getWidth();
        double fenetre_size_y = mg.getSize().getHeight();
        int size_x = m.getSize_x();
        int size_y = m.getSize_y();

        int squareEveryX = (int) (fenetre_size_x / size_x);
        int squareEveryY = (int) (fenetre_size_y / size_y);

        CareCelule[] cc = new CareCelule[m.getSize_x()*m.getSize_y()];

        int i = 0;
        for (int x=0; x<m.getSize_x();x++) {
            for (int y=0; y<m.getSize_y();y++) {
                //System.out.println(x*squareEveryX);
                //System.out.println(y*squareEveryY);
                //System.out.println(squareEveryX);
                //System.out.println(squareEveryY);
                //System.out.println(m.get_celule_by_co(x, y).get_etat());
                cc[i] = new CareCelule((int) (x*squareEveryX), (int) (y*squareEveryY), (int) squareEveryX, (int) squareEveryY,m.get_celule_by_co(x, y).get_etat());
                i++;
            }
        }
        cc[0] = new CareCelule(-200, -200, 2000 ,2000 , true);
        cc[0].paintcelule(g);
        for(CareCelule c : cc) {
            c.paintcelule(g);
            System.out.println("Paint");
        }
    }


}
