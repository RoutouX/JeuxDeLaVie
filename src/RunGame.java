import java.util.concurrent.TimeUnit;

public class RunGame extends Thread {
    private Map m;

    private MoteurGraphique moteurgraphique;

    public RunGame() {
        this.m = new Map(38, 22);
    }

    public void run() {
        long tempsDebut;
        long tempsFin;
        this.m.map_preupdate();
        while (true) {
            tempsDebut = System.currentTimeMillis();
            this.m.map_update();
            tempsFin = System.currentTimeMillis();
            this.m.map_preupdate();
            while ((tempsFin - tempsDebut)<333) {
                try {
                    TimeUnit.MILLISECONDS.sleep(10);
                    tempsFin = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            moteurgraphique.repaint();
        }
    }

    public void setMoteurGraphique(MoteurGraphique moteurG){
        this.moteurgraphique = moteurG;
    }

    public Map getMap() {
        return this.m;
    }

}
