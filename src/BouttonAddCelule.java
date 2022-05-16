import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonAddCelule extends JButton {
    MoteurGraphique moteurGraphique;

    public BouttonAddCelule(MoteurGraphique moteurGraphique){
        this.moteurGraphique = moteurGraphique;

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>Add<br>Celule</html>");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(moteurGraphique.getAffichage().gettypePaterne()==1){
                    moteurGraphique.getAffichage().switchAffMapOver();
                }else{
                    moteurGraphique.getAffichage().settypePaterne(1);
                    moteurGraphique.getAffichage().setAffMapOver(true);
                }
                moteurGraphique.revalidate();
                moteurGraphique.repaint();
            }
        });
    }
}
