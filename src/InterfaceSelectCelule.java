import javax.swing.*;
import java.awt.*;

public class InterfaceSelectCelule extends JLabel {

    private MoteurGraphique moteurGraphique;
    private BouttonAddCelule bouttonAddCelule;
    private BouttonAddCanon bouttonAddCanon;

    public InterfaceSelectCelule (MoteurGraphique mg){
        this.moteurGraphique = mg;
        bouttonAddCelule = new BouttonAddCelule();
        bouttonAddCanon = new BouttonAddCanon();

        //this.moteurGraphique.getWidth()-100
        //this.moteurGraphique.getHeight()
        this.setBounds(100,100,100,100);
        this.setBackground(new Color(0,255,0,255));

        this.add(this.bouttonAddCelule);
        this.add(this.bouttonAddCanon);

    }

}
