import java.awt.*;


public class CareCeluleFake {
    private int xPosC;
    private int yPosC;
    private int widthC;
    private int heightC;

    private boolean etatC;

    public CareCeluleFake(int xPos, int yPos, int width, int height, boolean etat){
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
        g.setColor(Color.RED);
        g.fillRect(xPosC,yPosC,widthC,heightC);
        g.setColor(Color.BLACK);
        g.drawRect(xPosC,yPosC,widthC,heightC);
    }
}
