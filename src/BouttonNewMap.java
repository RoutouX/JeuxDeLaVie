import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonNewMap extends JButton {
    private MoteurGraphique moteurGraphique;

    public BouttonNewMap(MoteurGraphique mg){
        this.moteurGraphique = mg;

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>New<br>Map</html>");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moteurGraphique.getInterfaceNewMap().switchVisible();
                moteurGraphique.getInterfaceSelectCelule().revalidate();
                moteurGraphique.getInterfaceSelectCelule().repaint();
            }
        });
    }
}
