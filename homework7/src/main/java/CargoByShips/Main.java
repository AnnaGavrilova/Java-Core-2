package CargoByShips;

import java.util.concurrent.Semaphore;

public class Main {
    public static final int shipsCount = 5;

    public static void main(String[] args) {

        final Piers piers = new Piers(new Pier("Clothes", 100, 2700),
                new Pier("Food", 100, 5900), new Pier("Fuel", 100, 8500));

        Semaphore smp = new Semaphore(2);
        final Race race = new Race(new WayToUnloading(), new Strait(smp), new WayToPier(), piers, new WayToPier(), new Strait(smp), new WayToUnloading());

        final Ship[] ships = new Ship[shipsCount];
        for (int i = 0; i < ships.length; i++) {
            ships[i] = new Ship();
        }

        for (int i = 0; i < ships.length; i++) {
            new Thread(ships[i]).start();
        }
    }
}
