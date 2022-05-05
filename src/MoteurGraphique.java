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


public class MoteurGraphique extends Thread {
    private JFrame f = new JFrame("Jeux de la vie");
    private Dimension frameSize;

    Map m;

    public MoteurGraphique(Map m) {
        this.m = m;
        frameSize = f.getSize();
        System.out.println(frameSize);
    }


    public void run() {
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1920, 1080);
        f.add(new Affichage(this.m, this.frameSize));
        f.setVisible(true);
    }

}
