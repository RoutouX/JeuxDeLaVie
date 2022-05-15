import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BouttonAddElement extends JButton {
    private MoteurGraphique moteurGraphique;

    public BouttonAddElement(MoteurGraphique mg){
        this.moteurGraphique = mg;

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>Add<br>Square</html>");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moteurGraphique.getInterfaceSelectCelule().switchVisible();
                moteurGraphique.getInterfaceSelectCelule().revalidate();
                moteurGraphique.getInterfaceSelectCelule().repaint();
            }
        });
    }
}