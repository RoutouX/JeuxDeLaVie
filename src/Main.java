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
        Map m = new Map(10, 10);
        while (true) {
            m.print_map();
            m.map_update();
            TimeUnit.SECONDS.sleep(4);

        }

        //celule celule0 = new celule(true, 0, 0);
        //SwingUtilities.invokeLater(new Runnable()
        //{
            //public void run()
            //{
                //createAndShowGUI();
            //}
        //});
    }


    private static void createAndShowGUI(){
        System.out.println("Created GUI on EDT? "+SwingUtilities.isEventDispatchThread());
        JFrame f = new JFrame("Swing Paint Demo");
        f.setPreferredSize(new Dimension(400,200));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new JPanel());
        f.pack();
        f.setVisible(true);
    }
}
