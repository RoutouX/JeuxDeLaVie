import java.util.concurrent.TimeUnit;

public class RunGame extends Thread {
    private Map m;


    public RunGame() {
        this.m = new Map(19, 10);
    }

    public void run() {
        while (true) {
            this.m.print_map();
            this.m.map_update();
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Map getMap() {
        return this.m;
    }
}
