import java.awt.*;
import java.util.concurrent.TimeUnit;

public class RunGame extends Thread {
    private boolean pause = false;
    private int speed = 1000;
    private Map m;


    private MoteurGraphique moteurgraphique;

    public RunGame() {
        this.m = new Map(64, 36, true);
    }

    public void run() {
        long tempsDebut;
        long tempsFin;
        this.m.map_preupdate();
        while (true)
        {
            while (this.pause == false) {
                tempsDebut = System.currentTimeMillis();
                this.m.map_preupdate();
                this.m.map_update();
                moteurgraphique.revalidate();
                moteurgraphique.repaint();
                tempsFin = System.currentTimeMillis();
                while ((tempsFin - tempsDebut)< speed) {
                    //System.out.print("Temps Debut = " + tempsDebut);
                    //System.out.print("\tTemps Fin = " + tempsFin);
                    //System.out.print("\tSpeed = " + speed + "\n");
                    try {TimeUnit.MILLISECONDS.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
                    tempsFin = System.currentTimeMillis();
                }
            }
            try {TimeUnit.MILLISECONDS.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}

        }
    }

    public void setMoteurGraphique(MoteurGraphique moteurG){
        this.moteurgraphique = moteurG;
    }

    public void switchpause(){
        this.pause = !this.pause;
    }

    public Map getMap() {
        return this.m;
    }

    public void setSpeed(int setSpped){
        this.speed = setSpped;
    }

    public int getSpeed(){
        return this.speed;
    }

    public Map resetMap(){
        int sizeX = this.m.getSize_x();
        int sizeY = this.m.getSize_y();
        m = new Map(sizeX, sizeY, false);
        return m;
    }

}
