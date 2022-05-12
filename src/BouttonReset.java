import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonReset extends JButton {
    private MoteurGraphique moteurGraphique;
    private RunGame rungame;

    public BouttonReset(RunGame RunG, MoteurGraphique mg){
        this.rungame = RunG;
        this.moteurGraphique = mg;
        this.setPreferredSize(new Dimension(90, 90));
        this.setText("Reset");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Map m = rungame.resetMap();
                moteurGraphique.getAffichage().changeAffichageMap(m);
            }
        });
    }
}
