import java.util.concurrent.TimeUnit;

public class RunGame extends Thread {
    private Map m;


    public RunGame() {
        this.m = new Map(192, 108);
    }

    public void run() {
        while (true) {
            //this.m.print_map();
            this.m.map_update();
            m.setMap_updated(true);
            try {
                TimeUnit.MILLISECONDS.sleep(333);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Map getMap() {
        return this.m;
    }

}
