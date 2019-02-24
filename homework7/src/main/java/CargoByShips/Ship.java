package CargoByShips;


public class Ship implements Runnable {
    private static int shipsCount;

    static {
        shipsCount = 0;
    }

    private int capacity;
    private String name;
    private Race race;

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public Ship() {
        shipsCount++;
        this.name = "Корабль " + shipsCount;
        this.capacity = 500;
    }

    @Override
    public void run() {
        for (int i = 0; i < race.getStages().size(); i++) {
            race.getStages().get(i).go(this);
        }
    }
}
