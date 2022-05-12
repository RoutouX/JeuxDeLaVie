import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class BouttonAddElement extends JButton {
    private MoteurGraphique moteurGraphique;
    private RunGame rungame;

    private InterfaceSelectCelule interfaceSelectCelule;


    private boolean interfaceIsShow = false;

    public BouttonAddElement(RunGame RunG, MoteurGraphique mg){
        this.rungame = RunG;
        this.moteurGraphique = mg;
        this.interfaceSelectCelule = new InterfaceSelectCelule(mg);

        this.setPreferredSize(new Dimension(90, 90));
        this.setText("<html>Add<br>Square</html>");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (interfaceIsShow){
                    moteurGraphique.remove(interfaceSelectCelule);
                    System.out.println("Add Square Interface is not visible\n");
                    interfaceIsShow = false;
                }else{
                    moteurGraphique.add(interfaceSelectCelule);
                    System.out.print("Add Square Interface is visible\n");
                    interfaceIsShow = true;
                }
                moteurGraphique.revalidate();
                moteurGraphique.repaint();
            }
        });
    }
}