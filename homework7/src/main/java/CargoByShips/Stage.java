package CargoByShips;

import java.util.concurrent.Semaphore;

public abstract class Stage {
    protected String name;
    protected Semaphore smp;


    public String getName() {
        return name;
    }

    public abstract void go(Ship ship);
}
