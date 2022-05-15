import javax.swing.*;
import java.awt.*;

public class InterfaceSelectCelule extends JPanel {
    boolean isVisible = false;
    MoteurGraphique moteurGraphique;
    BouttonAddCelule bouttonAddCelule;
    BouttonAddCaree bouttonAddCaree;
    BouttonAddVaisseaux bouttonAddVaisseaux;
    BouttonAddCanon bouttonAddCanon;

    public InterfaceSelectCelule(MoteurGraphique mg){
        this.moteurGraphique = mg;
        this.bouttonAddCelule = new BouttonAddCelule(mg);
        this.bouttonAddCaree = new BouttonAddCaree(mg);
        this.bouttonAddVaisseaux = new BouttonAddVaisseaux(mg);
        this.bouttonAddCanon = new BouttonAddCanon(mg);


        this.setBounds(moteurGraphique.getWidth()-100,0,100, moteurGraphique.getHeight());
        this.setBackground(new Color(0,0,0,75));

        this.add(bouttonAddCelule);
        this.add(bouttonAddCaree);
        this.add(bouttonAddVaisseaux);
        this.add(bouttonAddCanon);

        this.setVisible(isVisible);

    }

    public void switchVisible(){
        if (isVisible == true){
            isVisible = false;
        }else{
            isVisible = true;
        }
        this.setVisible(isVisible);
    }




}
