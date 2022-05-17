import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.*;
import java.io.Console;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class MoteurGraphique extends JFrame {

    private Map m;
    private RunGame rungame;
    private Affichage frame;
    private Interface interfacejeux ;
    private InterfaceSelectCelule interfaceSelectCelule;
    private InterfaceNewMap interfaceNewMap;

    public MoteurGraphique(Map m, RunGame rungameA) {
        this.m = m;
        this.rungame = rungameA;
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addComponentListener(new ComponentAdapter() {
            public void componentResized(ComponentEvent e) {
                interfaceSelectCelule.MiseAJour();
                interfaceNewMap.MiseAJour();
            }
        });
    }

    public void run() {
        this.frame = new Affichage(this.m, this);
        this.interfacejeux = new Interface(this.rungame, this);
        this.interfaceSelectCelule = new InterfaceSelectCelule(this);
        this.interfaceNewMap = new InterfaceNewMap(this);


        this.add(this.interfacejeux);
        this.add(this.interfaceSelectCelule);
        this.add(this.interfaceNewMap);
        this.add(this.frame);


        this.setVisible(true);
    }

    public Affichage getAffichage(){
        return frame;
    }
    public Interface getInterfacejeux(){return interfacejeux;}
    public InterfaceSelectCelule getInterfaceSelectCelule(){return  interfaceSelectCelule;}
    public InterfaceNewMap getInterfaceNewMap(){return this.interfaceNewMap;}

    public Map getMap(){return m;}
    public void setMap(Map map){
        this.m = map;
        rungame.changeMap(map);

        this.remove(this.interfacejeux);
        this.remove(this.interfaceSelectCelule);
        this.remove(this.interfaceNewMap);
        this.remove(this.frame);

        this.frame = new Affichage(this.m, this);
        this.interfacejeux = new Interface(this.rungame, this);
        this.interfaceSelectCelule = new InterfaceSelectCelule(this);
        this.interfaceNewMap = new InterfaceNewMap(this);

        this.add(this.interfacejeux);
        this.add(this.interfaceSelectCelule);
        this.add(this.interfaceNewMap);
        this.add(this.frame);
    }
}
