import javax.swing.*;
import java.awt.*;

public class Interface extends JPanel {
    private MoteurGraphique moteurGraphique;

    private BouttonPause boutonpause;
    private BouttonSpeedPlus boutonspeedplus;
    private BouttonSpeedMoin boutonspeedmoin;
    private TextFieldSpeed texteSpeed;
    private BouttonReset bouttonReset;
    private BouttonAddElement bouttonAddElement;
    private BouttonNewMap bouttonNewMap;
    private RunGame rungame;

    public Interface(RunGame rungameA, MoteurGraphique mg){
        this.moteurGraphique = mg;
        this.rungame = rungameA;
        this.texteSpeed = new TextFieldSpeed(rungame);
        this.boutonpause = new BouttonPause(rungame, texteSpeed);
        this.boutonspeedplus = new BouttonSpeedPlus(rungame, texteSpeed);
        this.boutonspeedmoin = new BouttonSpeedMoin(rungame, texteSpeed);
        this.bouttonReset = new BouttonReset(rungame, moteurGraphique);
        this.bouttonAddElement = new BouttonAddElement(moteurGraphique);
        this.bouttonNewMap = new BouttonNewMap(moteurGraphique);

        this.setBounds(0,0,100,this.moteurGraphique.getHeight());
        this.setBackground(new Color(0,0,0,75));

        this.add(this.boutonpause);
        this.add(this.boutonspeedplus);
        this.add(this.texteSpeed);
        this.add(this.boutonspeedmoin);
        this.add(this.bouttonReset);
        this.add(this.bouttonAddElement);
        this.add(this.bouttonNewMap);
    }


}
