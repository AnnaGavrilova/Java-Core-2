package CargoByShips;

import java.util.ArrayList;
import java.util.Arrays;

public class Piers extends Stage {
    private ArrayList<Pier> piers;

    public ArrayList<Pier> getPiers() {
        return piers;
    }

    public Piers(Pier... piers) {
        this.piers = new ArrayList<>(Arrays.asList(piers));
    }

    @Override
    public void go(Ship ship) {
        try {
            for (Pier o : piers) {
                if (!o.isEmpty()) {
                    if (o.getAmountOfCargo() > 500) {
                        System.out.println(ship.getName() + " подошел на загрузку: " + o.getName());
                        o.setAmountOfCargo(o.getAmountOfCargo() - ship.getCapacity());
                        Thread.sleep(5 * 1000);
                        System.out.println(ship.getName() + " закончил загрузку: " + o.getName());
                    } else if (o.getAmountOfCargo() > 100) {
                        System.out.println(ship.getName() + " подошел на загрузку: " + o.getName());
                        while (o.getAmountOfCargo() >= 0) {
                            o.setAmountOfCargo(o.getAmountOfCargo() - 100);
                            Thread.sleep(1000);
                        }
                        System.out.println(ship.getName() + " закончил загрузку: " + o.getName());
                        o.setEmpty(true);
                    }
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
