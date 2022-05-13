import javax.swing.*;
import java.awt.*;

public class Contenaire extends JPanel {
    MoteurGraphique moteurGraphique;
    public Contenaire(MoteurGraphique mg){
        this.moteurGraphique = mg;
        this.setBounds(0,0,this.moteurGraphique.getWidth(),this.moteurGraphique.getHeight());
        this.setBackground(new Color(0,0,0,125));
    }

}
