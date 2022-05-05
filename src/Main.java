import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
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

public class Main
{
    public static void main(String[] args) throws InterruptedException {
        RunGame runGame = new RunGame();
        Map m = runGame.getMap();
        MoteurGraphique moteurGraphique = new MoteurGraphique(m);

        Thread threadGame = new Thread(runGame);

        threadGame.start();
        moteurGraphique.run();
    }
}
