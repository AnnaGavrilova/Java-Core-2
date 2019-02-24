package CargoByShips;

public class Pier {
    protected String name;
    protected int speedLoading;
    protected volatile int amountOfCargo;
    protected volatile boolean isEmpty;

    public Pier(String name, int speedLoading, int amountOfCargo) {
        this.name = name;
        this.speedLoading = speedLoading;
        this.amountOfCargo = amountOfCargo;
        this.isEmpty = false;
    }

    public int getAmountOfCargo() {
        return amountOfCargo;
    }

    public void setAmountOfCargo(int amountOfCargo) {
        this.amountOfCargo = amountOfCargo;
    }

    public String getName() {
        return name;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
