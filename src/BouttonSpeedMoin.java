import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonSpeedMoin extends JButton {
    private RunGame rungame;
    private TextFieldSpeed textFieldSpeed;

    public BouttonSpeedMoin(RunGame RunG, TextFieldSpeed txtfs){
        this.rungame = RunG;
        this.textFieldSpeed = txtfs;
        this.setPreferredSize(new Dimension(90, 90));
        this.setText("-");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rungame.setSpeed((rungame.getSpeed()*2));
                textFieldSpeed.loadTextSpeed();
            }
        });
    }

}