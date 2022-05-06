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


    public MoteurGraphique(Map m) {
        this.m = m;
        this.setSize(1920, 1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void run() {
        while (true) {
            this.add(new Affichage(this.m, this));
            this.setVisible(true);
            m.setMap_updated(false);
            while (m.getMap_updated() == false) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}
