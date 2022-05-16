import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BouttonPause extends JButton {
    private RunGame rungame;
    private TextFieldSpeed textFieldSpeed;

    public BouttonPause(RunGame RunG, TextFieldSpeed txtfs){
        this.rungame = RunG;
        this.textFieldSpeed = txtfs;
        this.setPreferredSize(new Dimension(90, 90));
        this.setText("Pause");
        this.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rungame.switchpause();
                SwitchText();
                }
        });
    }

    public void SwitchText(){
        if(this.getText() == "Pause"){
            this.setText("Start");
        }else{
            this.setText("Pause");
        }
    }
}
