import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.io.Console;
import java.awt.event.MouseMotionAdapter;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class MoteurGraphique extends JFrame {

    private Map m;

    private RunGame rungame;
    private Affichage frame;
    private Interface interfacejeux ;

    public MoteurGraphique(Map m, RunGame rungameA) {
        this.m = m;
        this.rungame = rungameA;
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void run() {
        this.frame = new Affichage(this.m, this);
        this.interfacejeux = new Interface(this.rungame, this);
        this.add(this.interfacejeux);
        this.add(this.frame);
        this.setVisible(true);
    }

    public Affichage getAffichage(){
        return frame;
    }
}
