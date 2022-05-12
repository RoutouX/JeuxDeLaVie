import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class TextFieldSpeed extends JTextField {

    private RunGame rungame;

    public TextFieldSpeed(RunGame RunG){
        this.rungame = RunG;
        this.setPreferredSize(new Dimension(90, 20));
        this.setEditable(false);
        this.loadTextSpeed();
    }

    public void loadTextSpeed(){
        DecimalFormat df;
        double speed = ((rungame.getSpeed() * 1.0)/1000);
        if (speed < 0.9){
            df = new DecimalFormat("#.###");
        }
        else if ((speed >= 0.9)&&(speed <= 1.1)){
            rungame.setSpeed(1000);
            df = new DecimalFormat("#");
        }
        else{
            df = new DecimalFormat("###");
        }
        this.setText("Speed: " + df.format(speed) + " s");
    }
}
