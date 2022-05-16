import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonAddVaisseaux extends JButton {
    MoteurGraphique moteurGraphique;
    PaterneCelule paterneCelule;

    public BouttonAddVaisseaux(MoteurGraphique moteurGraphique){
        this.moteurGraphique = moteurGraphique;

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>Add<br>Vaisseaux</html>");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(moteurGraphique.getAffichage().gettypePaterne()==3){
                    moteurGraphique.getAffichage().switchAffMapOver();
                }else{
                    moteurGraphique.getAffichage().settypePaterne(3);
                    moteurGraphique.getAffichage().setAffMapOver(true);
                }
                moteurGraphique.revalidate();
                moteurGraphique.repaint();
            }
        });
    }
}
