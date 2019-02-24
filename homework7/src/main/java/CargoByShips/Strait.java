package CargoByShips;

import java.util.concurrent.Semaphore;

public class Strait extends Stage {

    public Strait(Semaphore smp) {
        this.name = "Пролив";
        this.smp = smp;
    }

    @Override
    public void go(Ship ship) {
        try {
            System.out.println(ship.getName() + " готов к прохождению: " + name);
            smp.acquire();
            System.out.println(ship.getName() + " начал проходить: " + name);
            Thread.sleep(500 + (int) (Math.random() * 800));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(ship.getName() + " прошел: " + name);
            smp.release();
        }
    }

}
