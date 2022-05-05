import javax.swing.*;
import java.awt.*;
import java.security.PublicKey;

public class Affichage extends JPanel {
    int size_x;
    int size_y;

    CareCelule[][] tblCareeClule;
    public Affichage(Map m, Dimension framesize){
        System.out.println(framesize);
        this.size_x = m.getSize_x();
        this.size_y = m.getSize_y();
    }

    public void squaretbl(){
        tblCareeClule = new CareCelule[this.size_x][this.size_y];
        for (int x=0; x<size_x;x++) {
            for (int y=0; y<size_x;y++) {
                tblCareeClule[x][y] = new CareCelule(0, 0, 0, 0, false);
            }
        }
    }

}
