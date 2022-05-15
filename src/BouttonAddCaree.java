import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonAddCaree extends JButton {

    MoteurGraphique moteurGraphique;

    public BouttonAddCaree(MoteurGraphique moteurGraphique){
        this.moteurGraphique = moteurGraphique;

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>Add<br>Celule</html>");

        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moteurGraphique.getAffichage().settypePaterne(2);
                moteurGraphique.getAffichage().switchAffMapOver();
                moteurGraphique.revalidate();
                moteurGraphique.repaint();
            }
        });
    }

}
