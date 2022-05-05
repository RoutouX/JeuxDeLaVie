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
import java.awt.event.MouseMotionAdapter;




public class CareCelule {
    private int xPosC;
    private int yPosC;
    private int widthC;
    private int heightC;

    private boolean etatC;

    public CareCelule(int xPos, int yPos, int width, int height, boolean etat){
        this.xPosC = xPos;
        this.yPosC = yPos;
        this.widthC = width;
        this.heightC = height;
        this.etatC = etat;
    }


    public int getX(){
        return xPosC;
    }

    public int getY(){
        return yPosC;
    }

    public int getWidth(){
        return widthC;
    }

    public int getHeight(){
        return heightC;
    }

    public void paintcelule(Graphics g){
        if (this.etatC){g.setColor(Color.BLUE);}
        else {g.setColor(Color.WHITE);}
        g.fillRect(xPosC,yPosC,widthC,heightC);
        g.setColor(Color.BLACK);
        g.drawRect(xPosC,yPosC,widthC,heightC);
    }
}
