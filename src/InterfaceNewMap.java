import javax.swing.*;
import java.awt.*;

public class InterfaceNewMap extends JPanel {

    boolean isVisible = false;
    MoteurGraphique moteurGraphique;
    BouttonAddCelule bouttonAddCelule;
    BouttonAddCaree bouttonAddCaree;
    BouttonAddVaisseaux bouttonAddVaisseaux;
    BouttonAddCanon bouttonAddCanon;

    public InterfaceNewMap(MoteurGraphique mg){
        this.moteurGraphique = mg;
        this.bouttonAddCelule = new BouttonAddCelule(mg);
        this.bouttonAddCaree = new BouttonAddCaree(mg);
        this.bouttonAddVaisseaux = new BouttonAddVaisseaux(mg);
        this.bouttonAddCanon = new BouttonAddCanon(mg);

        this.setBounds((moteurGraphique.getContentPane().getWidth()/2)-200,(moteurGraphique.getContentPane().getHeight()/2)-100,400, 200);
        this.setBackground(new Color(0,0,0,150));

        this.add(bouttonAddCelule);
        this.add(bouttonAddCaree);
        this.add(bouttonAddVaisseaux);
        this.add(bouttonAddCanon);

        this.setVisible(isVisible);
    }

    public void MiseAJour(){
        this.setBounds((moteurGraphique.getContentPane().getWidth()/2)-200,(moteurGraphique.getContentPane().getHeight()/2)-200,400, 200);
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
